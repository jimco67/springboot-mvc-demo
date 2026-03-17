# Spring Boot MVC Demo

[![Coverage](.github/badges/jacoco.svg)](https://github.com/${{ github.repository }}/actions)
[![Branches](.github/badges/branches.svg)](https://github.com/${{ github.repository }}/actions)

Simple Spring Boot MVC project with Cucumber tests and GitHub Actions reporting.

## Features
- Cucumber BDD tests
- JaCoCo code coverage
- GitHub Actions CI/CD
- Automatic coverage badge update

## How to run tests locally
```bash
mvn test
```
The Cucumber report will be available at `target/cucumber-reports/cucumber.html`.
The JaCoCo report will be available at `target/site/jacoco/index.html`.
