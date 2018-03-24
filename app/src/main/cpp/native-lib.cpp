#include <jni.h>
#include <string>
#include<android/log.h>

//extern "C"
//JNIEXPORT jstring
//
//JNICALL
//Java_me_mehdi_mynativeapp_MainActivity_stringFromJNI(
//        JNIEnv *env,
//        jobject /* this */) {
//    std::string hello = "Hello from C++";
//    return env->NewStringUTF(hello.c_str());
//}

#define LOG_TAG "mynativelib"
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)

extern "C"
JNIEXPORT float JNICALL
Java_me_mehdi_mynativeapp_MyNativeLib_mean(JNIEnv *env, jclass type, jintArray a_) {
    jint *a = env->GetIntArrayElements(a_, NULL);

    int len = 10;
    LOGI("Array length is: %d", len );

    float sum = 0;
    for (int i=0 ; i < len; i++) {
        sum += a[i];
    }

    env->ReleaseIntArrayElements(a_, a, 0);


    __android_log_print(ANDROID_LOG_INFO, "mynativelib", "Sum: %.6f", sum);
    return sum / len;
}