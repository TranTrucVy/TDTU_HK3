import pandas as pd
import numpy as np
import math

df = pd.read_csv('population.csv')
df.tail()

country_dict = {
    'Country Name': df['Country Name'].unique(),
    'Country Code': df['Country Code'].unique(),
    'Sum': np.zeros(len(df['Country Name'].unique())),
    'Count': np.zeros(len(df['Country Name'].unique())),
	'Mean': np.zeros(len(df['Country Name'].unique())),
	'Std': np.zeros(len(df['Country Name'].unique()), dtype=np.float64),
	'Min': np.full(len(df['Country Name'].unique()), np.inf),
	'Max': np.full(len(df['Country Name'].unique()), -np.inf),
}

for i in df.iterrows():
	country_code = i[1]['Country Code']
	country_year = i[1]['Year']
	country_index = np.where(country_dict['Country Code'] == country_code)[0][0]
	country_dict['Sum'][country_index] += country_year
	country_dict['Count'][country_index] += 1
	country_dict['Mean'][country_index] = country_dict['Sum'][country_index] / country_dict['Count'][country_index]
	country_dict['Min'][country_index] = min(country_dict['Min'][country_index], country_year)
	country_dict['Max'][country_index] = max(country_dict['Max'][country_index], country_year)
	country_dict['Std'][country_index] = country_year - country_dict['Mean'][country_index] 
 
for i in df.iterrows():
	country_index = np.where(country_dict['Country Code'] == country_code)[0][0]
	country_dict['Sum'][country_index] += country_year
	country_dict['Std'][country_index] = math.sqrt(country_dict['Std'][country_index]**2 / country_dict['Count'][country_index])

	
country_dict.pop('Sum')
country_dict.pop('Count')
df1 = pd.DataFrame(country_dict )
print(df1)