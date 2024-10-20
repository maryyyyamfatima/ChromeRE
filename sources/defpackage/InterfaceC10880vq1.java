package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10880vq1 {
    AbstractC8508ov b(AbstractC8508ov abstractC8508ov);

    void c();

    void connect();

    AbstractC8508ov d(AbstractC8508ov abstractC8508ov);

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    ConnectionResult f(TimeUnit timeUnit);

    boolean isConnected();
}
