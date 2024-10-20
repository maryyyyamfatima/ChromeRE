package defpackage;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3129Yc {
    void a(String str);

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    int getMinApkVersion();

    boolean requiresSignIn();
}
