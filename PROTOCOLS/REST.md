#PROTOCOL #WEB 

![Pasted image 20221221093721.png](Pasted%20image%2020221221093721.png)

**REST**, or *REpresentational State Transfer*, is an architectural style for providing standards between computer systems on the web, making it easier for systems to communicate with each other. REST-compliant systems, often called RESTful systems, are characterized by how they are stateless and separate the concerns of client and server.

In the REST architectural style, the implementation of the client and the implementation of the server can be done independently without each knowing about the other. This means that the code on the client side can be changed at any time without affecting the operation of the server, and the code on the server side can be changed without affecting the operation of the client.

As long as each side knows what format of messages to send to the other, they can be kept modular and separate.

By using a REST interface, different clients hit the same REST endpoints, perform the same actions, and receive the same responses.

In the REST architecture, clients send requests to retrieve or modify resources, and servers send responses to these requests.

### Making Requests

REST requires that a client make a request to the server in order to retrieve or modify data on the server. A request generally consists of:

-   an HTTP verb, which defines what kind of operation to perform
-   a _header_, which allows the client to pass along information about the request
-   a path to a resource
-   an optional message body containing data

#### HTTP Verbs

There are 4 basic HTTP verbs we use in requests to interact with resources in a REST system:

-   GET — retrieve a specific resource (by id) or a collection of resources
-   POST — create a new resource
-   PUT — update a specific resource (by id)
-   DELETE — remove a specific resource by id

#### Headers and Accept parameters

In the header of the request, the client sends the type of content that it is able to receive from the server. This is called the `Accept` field, and it ensures that the server does not send data that cannot be understood or processed by the client. The options for types of content are MIME Types (or Multipurpose Internet Mail Extensions.

MIME Types, used to specify the content types in the `Accept` field, consist of a `type` and a `subtype`. They are separated by a slash (/).

For example, a text file containing HTML would be specified with the type `text/html`. If this text file contained CSS instead, it would be specified as `text/css`. A generic text file would be denoted as `text/plain`. This default value, `text/plain`, is not a catch-all, however. If a client is expecting `text/css` and receives `text/plain`, it will not be able to recognize the content.

Other types and commonly used subtypes:

-   `image` — `image/png`, `image/jpeg`, `image/gif`
-   `audio` — `audio/wav`, `audio/mpeg`
-   `video` — `video/mp4`, `video/ogg`
-   `application` — `application/json`, `application/pdf`, `application/xml`, `application/octet-stream`

For example, a client accessing a resource with `id` 23 in an `articles` resource on a server might send a GET request like this:

```
GET /articles/23
Accept: text/html, application/xhtml
```

The `Accept` header field in this case is saying that the client will accept the content in `text/html` or `application/xhtml`.

#### Paths

Requests must contain a path to a resource that the operation should be performed on. In RESTful APIs, paths should be designed to help the client know what is going on.

Conventionally, the first part of the path should be the plural form of the resource. This keeps nested paths simple to read and easy to understand.

A path like `fashionboutique.com/customers/223/orders/12` is clear in what it points to, even if you’ve never seen this specific path before, because it is hierarchical and descriptive. We can see that we are accessing the order with `id` 12 for the customer with `id` 223.

Paths should contain the information necessary to locate a resource with the degree of specificity needed. When referring to a list or collection of resources, it is not always necessary to add an `id`. For example, a POST request to the `fashionboutique.com/customers` path would not need an extra identifier, as the server will generate an `id` for the new object.

If we are trying to access a single resource, we would need to append an `id` to the path. For example: `GET fashionboutique.com/customers/:id` — retrieves the item in the `customers` resource with the `id` specified. `DELETE fashionboutique.com/customers/:id` — deletes the item in the `customers` resource with the `id` specified.

### Sending Responses

#### Content Types

In cases where the server is sending a data payload to the client, the server must include a `content-type` in the header of the response. This `content-type` header field alerts the client to the type of data it is sending in the response body. These content types are MIME Types, just as they are in the `accept` field of the request header. The `content-type` that the server sends back in the response should be one of the options that the client specified in the `accept` field of the request.

For example, when a client is accessing a resource with `id` 23 in an `articles` resource with this GET Request:

```
GET /articles/23 HTTP/1.1
Accept: text/html, application/xhtml
```

The server might send back the content with the response header:

```
HTTP/1.1 200 (OK)
Content-Type: text/html
```

This would signify that the content requested is being returned in the response body with a `content-type` of `text/html`, which the client said it would be able to accept.

#### Response Codes

Responses from the server contain status codes to alert the client to information about the success of the operation.

The most common ones and how they are used:

| Status                      | code	Meaning                                                                                                      |
| --------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| 200 (OK)                    | This is the standard response for successful HTTP requests.                                                       | 
| 201 (CREATED)               | This is the standard response for an HTTP request that resulted in an item being successfully created.            |
| 204 (NO CONTENT)            | This is the standard response for successful HTTP requests, where nothing is being returned in the response body. |
| 400 (BAD REQUEST)           | The request cannot be processed because of bad request syntax, excessive size, or another client error.           |
| 403 (FORBIDDEN)             | The client does not have permission to access this resource.                                                      |
| 404 (NOT FOUND)             | The resource could not be found at this time. It is possible it was deleted, or does not exist yet.               |
| 500 (INTERNAL SERVER ERROR) | The generic answer for an unexpected failure if there is no more specific information available.                  |

For each HTTP verb, there are expected status codes a server should return upon success:

-   GET — return 200 (OK)
-   POST — return 201 (CREATED)
-   PUT — return 200 (OK)
-   DELETE — return 204 (NO CONTENT) If the operation fails, return the most specific status code possible corresponding to the problem that was encountered.

# Architectural Constraints

Here are 6 REST constraints that we can consider as design rules, that must be applied to establish the distinct characteristics of the REST architectural style. In other words, These 6 architectural constraints which make any web service — a true RESTful API:

-   Interface / Uniform Contract: _Once a developer becomes familiar with one of your API, he should be able to follow the similar approach for other APIs._
-   Client-Server: _Servers and clients may also be replaced and developed independently, as long as the interface between them is not altered._
-   Stateless: _No client context shall be stored on the server between requests. The client is responsible for managing the state of the application._
-   Cache: _Well-managed caching partially or completely eliminates some client-server interactions, further improving scalability and performance._
-   Layered System
-   Code-On-Demand (optional)

# REST Resource Naming Guide

### Singleton and Collection Resources

A **resource can be a singleton or a collection**.

For example, “`customers`” is a collection resource and “`customer`” is a singleton resource (in a banking domain).

We can identify “`customers`” collection resource using the URI “`/customers`“. We can identify a single “`customer`” resource using the URI “`/customers/{customerId}`“.


### Collection and Sub-collection Resources

A **resource may contain sub-collection resources** also.

For example, sub-collection resource “`accounts`” of a particular “`customer`” can be identified using the URN “`/customers/{customerId}/accounts`” (in a banking domain).

Similarly, a singleton resource “`account`” inside the sub-collection resource “`accounts`” can be identified as follows: “`/customers/{customerId}/accounts/{accountId}`“.

## Best Practices

### Use nouns to represent resources

RESTful URI should refer to a resource that is a thing (noun) instead of referring to an action (verb) because nouns have properties that verbs do not have – similarly, resources have attributes.

#### document

A document resource is a singular concept that is akin to an object instance or database record.

In REST, you can view it as a single resource inside resource collection. A document’s state representation typically includes both fields with values and links to other related resources.

Use “singular” name to denote document resource archetype.

```
http://api.example.com/device-management/managed-devices/{device-id}
http://api.example.com/user-management/users/{id}
http://api.example.com/user-management/users/admin
```

#### collection

A collection resource is a server-managed directory of resources.

Clients may propose new resources to be added to a collection. However, it is up to the collection resource to choose to create a new resource or not.

A collection resource chooses what it wants to contain and also decides the URIs of each contained resource.

Use the “plural” name to denote the collection resource archetype.

```
http://api.example.com/device-management/managed-devices http://api.example.com/user-management/users 
http://api.example.com/user-management/users/{id}/accounts
```

#### store

A store is a client-managed resource repository. A store resource lets an API client put resources in, get them back out, and decide when to delete them.

A store never generates new URIs. Instead, each stored resource has a URI. The URI was chosen by a client when the resource initially put it into the store.

Use “plural” name to denote store resource archetype.

```
http://api.example.com/song-management/users/{id}/playlists
```

#### controller

A controller resource models a procedural concept. Controller resources are like executable functions, with parameters and return values, inputs, and outputs.

Use “verb” to denote controller archetype.

```
http://api.example.com/cart-management/users/{id}/cart/checkout http://api.example.com/song-management/users/{id}/playlist/play
```

#### Do not use underscores ( _ )

It’s possible to use an underscore in place of a hyphen to be used as a separator – But depending on the application’s font, it is possible that the underscore (_) character can either get partially obscured or completely hidden in some browsers or screens.

To avoid this confusion, use hyphens (-) instead of underscores ( _ ).

#### Use lowercase letters in URIs

### Do not use file extensions

### Never use CRUD function names in URIs

### Use query component to filter URI collection

Often, you will encounter requirements where you will need a collection of resources sorted, filtered, or limited based on some specific resource attribute.

For this requirement, do not create new APIs – instead, enable sorting, filtering, and pagination capabilities in resource collection API and pass the input parameters as query parameters. e.g.

```
http://api.example.com/device-management/managed-devices?region=USA&brand=XYZ&sort=installation-date
```