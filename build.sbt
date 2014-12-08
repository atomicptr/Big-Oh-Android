import android.Keys._

android.Plugin.androidBuild

name := "scaloid-basic-template"

scalaVersion := "2.11.2"

proguardCache in Android ++= Seq(
    ProguardCache("org.scaloid") % "org.scaloid"
)

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-dontwarn scala.collection.mutable.**")

libraryDependencies ++= Seq(
    "org.scaloid" %% "scaloid" % "3.5-10"
)

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android
