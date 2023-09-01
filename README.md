# Project Title: Airbnb+: An Online Stay Rental Application

## Project Description

Designed and built a single-page web application using **React**. Bootstraped the development with mature component library **AntD**.

## Responsibilities

- Designed and implemented the backend services based on **Spring Boot** to support stay upload, delete, search and reserve functionality.
- Used **MySQL** to store user-generated data, e.g. stay information and reservation history, and utilized **Google Cloud Storage** to store media files for the uploaded stays.
- Created geo index by **Elasticsearch** to support geo-based stay search based on user’s selected locations.
- Implemented **token-based** server-side user authentication based on the **Spring Security** framework.
- Deployed the backend service to **Google App Engine** for better scalability and reliability.

## Key Technologies

    Java, Spring Boot, Javascript, React, AntD, Google Cloud Storage, Google App Engine, Elasticsearch

## Upload Stay

Upload with three pictures in PNG format, upload the maximum guest number, upload the address and basic discription for the stay.

### Before Uploading

![Upload_Stay_Page](/static/Host_With_No_Stay.png)

### Uploading

![USP](/static/Upload_Stay.png)

### After Uploading

![USP](/static/Host_With_Stay.png)

## Search Stay

The result of searching stay is based on user's personal address within 50 miles

![Search_Stay](/static//Search_Stay.png)

## Book Stay

### Guest Side

![BS](/static/Book_Stay.png)

### Host Side

![BS](/static/View_Stay_Result.png)

## Login/Register

### Login with two identities: Host and Guest

![LR](/static/Guest.png)
![LR](/static/Host.png)
