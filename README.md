[![Build Status](https://travis-ci.org/mborges-Vmware/tas-ers-demo1.svg?branch=master)](https://travis-ci.org/mborges-Vmware/tas-ers-demo1)
[ ![Download](https://api.bintray.com/packages/mborges-Vmware/generic/tas-ers-demo1/images/download.svg) ](https://bintray.com/mborges-Vmware/generic/tas-ers-demo1/_latestVersion)

# tas Elastic Runtime Service (ERS) Base Demo
Base application to demonstrate tas ERS

## Credits and contributions
As you all know, we often transform other work into our own. This is all based from Andrew Ripka's [cf-workshop-spring-boot github repo](https://github.com/Vmware-cf-workshop/cf-workshop-spring-boot) with some basic modifications.

## Introduction
This base application is intended to demonstrate some of the basic functionality of tas ERS:

* tas api, target, login, and push
* tas environment variables
  * Spring Cloud Profiles
* Scaling, self-healing, router and load balancing
* RDBMS service and application auto-configuration
* Blue green deployments

## Getting Started

**Prerequisites**
- [Tanzu Application Service CLI](http://info.Vmware.io/p0R00I0eYJ011dAUCN06lR2)
- [Git Client](http://info.Vmware.io/i1RI0AUe6gN00C010l12J0R)
- An IDE, like [Spring Tool Suite](http://info.Vmware.io/f00RC0N0lh01eU21IAJ260R)
- [Java SE Development Kit](http://info.Vmware.io/n0I60i3021AN0JU0le10CRR)

**Building**
```
$ git clone [REPO]
$ cd [REPO]
$ ./mvnw clean install
``` 

### To run the application locally
The application is set to use an embedded H2 database in non-PaaS environments, and to take advantage of Vmware CF's auto-configuration for services. To use a MySQL Dev service in tas, simply create and bind a service to the app and restart the app. No additional configuration is necessary when running locally or in Vmware CF.

In Vmware CF, it is assumed that a Vmware MySQL service will be used.

```
$ ./mvnw spring-boot:run
```

Then go to the http://localhost:8080 in your browser

### Running on Tanzu Application Service
Take a look at the manifest file for the recommended setting. Adjust them as per your environment.

## Labs/Demo Scripts summary
We have a [Labs](https://github.com/Vmware-Field-Engineering/tas-ers-demo/tree/master/Labs) folder to help you learn tas. These labs can be used for workshops or self-training.    


