# 可能需要注意的一点问题

注意，使用`Lombok`的话，如果实体类构造错误（特别是在带`@Builder`的情况下）请加上：

- `@AllArgsConsturctor`
- `@NoArgsConstructor`
