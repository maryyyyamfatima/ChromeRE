package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7279lL3 {
    public static final Handler a;

    static {
        HandlerThread handlerThread = new HandlerThread("InputConnectionHandlerThread", 5);
        handlerThread.start();
        a = new Handler(handlerThread.getLooper());
    }
}
