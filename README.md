# Graphql Springboot Example
Sample app demonstarting graphql using Springboot.

You'll need [Java 11].


You can go to [http://localhost:8080/h2-console/login.jsp](http://localhost:8080/h2-console/login.jsp) and enter the following information:
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: <blank>

To check the database or to [http://localhost:8080/graphiql](http://localhost:8080/graphiql) to start executing queries. For example:
```
{
  findAllBooks {
    id
    isbn
    title
    pageCount
    author {
      firstName
      lastName
    }
  }
}
```

Or:
```
mutation {
  newBook(
    title: "Java: The Complete Reference, Tenth Edition", 
    isbn: "1259589331", 
    author: 1) {
      id title
  }
}
```

# Advantages of using Graphql

    1. One of the main benefits is clients have the ability to dictate exactly what they need from the server, and receive that data in a predictable way.
    2. No underfetching or overfetching of data.
    3. Another big benefit is the ability to retrieve many resources in a single request. 
    4. Another benefit is that it is strongly-typed which allows API consumers to know exactly what data is available, and in what form it exists.
    5. Less error prone , since automatic validtion and schema checking is present.
    6. Autogenerating API documentation.Documentation is available using Graphiql.GraphQL keeps documentation in sync with API changes. As the GraphQL API is tightly coupled with code, once a field, type or query changes, so do the docs.
    7.API evolution without versioning.GraphQL eliminates the need for versioning by deprecating APIs on a field level. Aging fields can be later removed from the schema without impacting the existing queries. 
    8. Rapid application prototyping. If the goal is to provide a prototype, CRUD operations can be time-consuming. GraphQL speeds up this process by providing a single API endpoint that serves as a data proxy between the UI and the data storage. 
    
    

# Disadvantages of using Graphql

    1. One disadvantage is that queries always return a HTTP status code of 200, regardless of whether or not that query was successful.
    2. Another disadvantage is the lack of built-in caching support. Because REST APIs have multiple endpoints, they can leverage native HTTP caching to avoid refetching resources. With GraphQL, you will need to setup your own caching support which means relying on another library, or setting up something like globally unique IDs for your backend.
    3. implementation of Graphql has lot of complexities associated unlike REST APIs.
    4. Graphql does not have support for File uploading unlike REST endpoints.
    5. Performance issues with complex queries. While enabling clients to request exactly what they need, GraphQL query can encounter performance issues if a client asks for too many nested fields at once. 


# References

    1. https://www.altexsoft.com/blog/engineering/graphql-core-features-architecture-pros-and-cons/
    
