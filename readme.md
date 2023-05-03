The 2-module project:
 - application-module module is the main module with SB application class. 
   This module depends on the model-module
 - model-module module contains:
         - the @ConfigurationProperties-annotated class
         - the @Configuration-annotated class that has @PropertySource annotation that references:
                - resource from the same module
                - resource from the application-module

Problem: the extra resource from the application-module added as @PropertySource is not resolved from the model-module
(since the application-module is not included to the model-module classpath)
Thus the properties from this file are shown as not used, are not resolved in @Value annotations;
also no config properties completion work in this file.
The application.properties file from the application-module is treated as project-wide however,
the properties from this file are resolved in @Value annotations in the model-module.