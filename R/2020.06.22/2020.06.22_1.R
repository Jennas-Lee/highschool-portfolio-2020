exam <- read.csv("../Data/csv_exam.csv")
exam

head(exam, 10)
tail(exam, 5)
str(exam)
dim(exam)   # dimension(차원)
summary(exam)
View(exam)  # 대문자

# 데이터 가공
exam %>% filter(class==1)
exam %>% filter(class==2)
exam %>% filter(class!=1)
exam %>% filter(class!=3)
exam %>% filter(math>=50)
exam %>% filter(english>=80)
exam %>% filter(math>=50 & english>=80)
exam %>% filter(math>=50 | english>=80)
exam %>% filter(class%%2!=0)  # 1, 3, 5

df_raw <- data.frame(var1 = c(1, 2, 1),
                     var2 = c(2, 3, 2))
df_raw


install.packages("dplyr")
library("dplyr")

df_new <- rename(df_raw, v2 = var2)

# 파생변수

var1 <- c(4, 3, 8)
var2 <- c(2, 6, 1)

df <- data.frame(var1, var2)

df
df$var_sum <- df$var1 + df$var2
df$var_sum

mean(df$var1)
mean(df$var2)

df$var_mean <- (df$var1 + df$var2) / 2
df

hist(df$var_mean)
