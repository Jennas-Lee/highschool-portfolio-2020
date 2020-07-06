install.packages("dplyr")
library(dplyr)

exam <- read.csv("Data/csv_exam.csv")
exam
dim(exam)
View(exam)

exam %>% filter(class == 1)
exam %>% filter(class == 2)
exam %>% filter(class != 1)
exam %>% filter(class != 3)
exam %>% filter(math >= 50)
exam %>% filter(english >= 80)
exam %>% filter(math >= 50 | english >= 80)
exam %>% filter(class == 1 | class == 3)

exam %>% select(math)
exam %>% select(english, class)
exam %>% select(-math)

exam %>% filter(class == 1) %>% select(english)
exam %>% 
  select(id, math) %>% 
  head
exam %>% arrange(math)
exam %>% arrange(desc(math))

exam %>% 
  mutate(total = math + english + science) %>% 
  head
exam %>% 
  mutate(total = math + english + science,
         mean = (math + english + science)/3) %>% 
  head
exam %>% 
  mutate(test = ifelse(science >= 60, "pass", "fail")) %>% 
  head(10)
