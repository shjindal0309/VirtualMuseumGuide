#include <jni.h>
#include <string>
#include <dlib/svm_threaded.h>
using namespace std;
extern "C"
jstring
Java_com_example_android_guide_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
