package defpackage;

import android.os.Looper;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10909vv0 {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    public static synchronized ClassLoader b() {
        synchronized (AbstractC10909vv0.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                b = a();
                if (b == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e) {
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread a() {
        SecurityException e;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (AbstractC10909vv0.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            thread2 = null;
                            break;
                        }
                        thread2 = threadArr[i];
                        if ("GmsDynamite".equals(thread2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new C10566uv0(threadGroup);
                    } catch (SecurityException e3) {
                        e = e3;
                        thread = thread2;
                    }
                    try {
                        thread.setContextClassLoader(null);
                        thread.start();
                    } catch (SecurityException e4) {
                        e = e4;
                        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                        thread2 = thread;
                        return thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
