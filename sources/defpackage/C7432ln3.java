package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ln3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7432ln3 implements Closeable {
    public final StrictMode.ThreadPolicy a;
    public final StrictMode.VmPolicy g;

    public C7432ln3(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.g = vmPolicy;
    }

    public static C7432ln3 b() {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        return new C7432ln3(threadPolicy, null);
    }

    public static C7432ln3 e() {
        return new C7432ln3(StrictMode.allowThreadDiskWrites(), null);
    }

    public static C7432ln3 c() {
        return new C7432ln3(StrictMode.allowThreadDiskReads(), null);
    }

    public static C7432ln3 f() {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        if (Build.VERSION.SDK_INT >= 26) {
            permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
            StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        }
        return new C7432ln3(threadPolicy, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.g;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
