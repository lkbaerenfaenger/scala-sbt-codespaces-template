# scala-sbt-codespaces-template

A repository template for Scala development in Codespaces

## Description

This GitHub repository template enables Scala 3 development in GitHub Codespaces.

As a starting point, the repository defines a minimal sbt project containing a "Hello, world." function and one unit test.
The project is ready to be extended.

To facilitate development in Codespaces, the repository defines a [dev container](https://containers.dev/) that references an [official sbt image](https://hub.docker.com/r/sbtscala/scala-sbt), making available a JDK, Scala and sbt.
It also enables several VS Code extensions, including [Scala Syntax](https://marketplace.visualstudio.com/items?itemName=scala-lang.scala) for syntax highlighting and [Metals](https://marketplace.visualstudio.com/items?itemName=scalameta.metals) for a fully-fledged IDE experience.

The repository also defines VS Code settings, which, among other things, provide that [Scalafmt](https://scalameta.org/scalafmt/) is the default formatter and that it is applied automatically upon saving a file.

## Getting started

1. [Create a new repository based on this repository template.](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template)
2. [Create a codespace for the new repository.](https://docs.github.com/en/codespaces/developing-in-codespaces/creating-a-codespace-for-a-repository)
3. When prompted by Metals with "New sbt workspace detected", click "Import build".

Optionally, refactor the following files and directories to remove references to this repository template:
- [`.devcontainer/devcontainer.json`](.devcontainer/devcontainer.json)
  - `name`
- [`build.sbt`](build.sbt)
  - `organization`
  - `name`
- [`src/main/scala`](src/main/scala)
  - Package declaration in [`HelloWorld.scala`](src/main/scala/com/typeduke/helloworld/HelloWorld.scala)
  - Package subdirectories accordingly
- [`src/test/scala`](src/test/scala)
  - Package declaration in [`HelloWorldTest.scala`](src/test/scala/com/typeduke/helloworld/HelloWorldTest.scala)
  - Package subdirectories accordingly
