package defpackage;

import android.app.Service;
import android.content.Context;
import org.chromium.base.process_launcher.FileDescriptorInfo;
import org.chromium.content.app.ContentChildProcessServiceDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BK {
    public static boolean p;
    public static int q;
    public static long r;
    public final CK a;
    public final Service b;
    public final Context c;
    public boolean f;
    public int g;
    public String h;
    public Thread i;
    public String[] j;
    public FileDescriptorInfo[] k;
    public boolean l;
    public boolean m;
    public InterfaceC0542Ee1 n;
    public final Object d = new Object();
    public final Object e = new Object();
    public final BinderC12074zK o = new BinderC12074zK(this);

    public BK(ContentChildProcessServiceDelegate contentChildProcessServiceDelegate, Service service, Context context) {
        this.a = contentChildProcessServiceDelegate;
        this.b = service;
        this.c = context;
    }
}
