# Setting Up Your Gemini API Key

This section explains how to set up the **Gemini API key** for the project.

## Obtain a Gemini API Key

1. **Visit the Google Cloud Console**: [https://console.cloud.google.com/](https://console.cloud.google.com/)
2. **Create a new project** or select an existing one where you want to enable the Gemini API.
3. Navigate to the **API Library** and search for "Gemini API".
4. **Enable the Gemini API** for your selected project.
5. Go to the **Credentials** section and create a new API key.

## Store Your API Key Securely

1. Locate the `local.properties` file in the root directory of your project.
2. Add the following line to the file, replacing `YOUR_ACTUAL_API_KEY` with the key you just generated:
    ```bash
    geminiApiKey = YOUR_ACTUAL_API_KEY
    ```

## Build and Run

You're all set! Now you can **build and run the application**. The project uses the **Secrets Gradle Plugin** to securely access your API key from the `local.properties` file during the build process.
