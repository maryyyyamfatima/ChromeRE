package defpackage;

import android.net.Uri;
import android.os.Process;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cr4 */
/* loaded from: classes.dex */
public final class C4364cr4 {
    public final MessageLite a;
    public C4381cu3[] b;

    public C4364cr4(C4641dg3 c4641dg3) {
        this.a = c4641dg3;
    }

    public final Object a(C1837Od2 c1837Od2) {
        AtomicLong atomicLong = AbstractC5964hX2.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + AbstractC5964hX2.a.getAndIncrement();
        Uri uri = c1837Od2.d;
        Uri build = uri.buildUpon().path(uri.getPath() + str).build();
        InterfaceC0090As interfaceC0090As = c1837Od2.a;
        ArrayList a = c1837Od2.a(interfaceC0090As.d(build));
        C4381cu3[] c4381cu3Arr = this.b;
        if (c4381cu3Arr != null) {
            for (C4381cu3 c4381cu3 : c4381cu3Arr) {
                c4381cu3.a(a);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) a.get(0);
            try {
                this.a.a(outputStream);
                C4381cu3[] c4381cu3Arr2 = this.b;
                if (c4381cu3Arr2 != null) {
                    for (C4381cu3 c4381cu32 : c4381cu3Arr2) {
                        c4381cu32.b();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                interfaceC0090As.c(build, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                interfaceC0090As.a(build);
            } catch (FileNotFoundException unused2) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
