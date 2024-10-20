package defpackage;

import J.N;
import android.content.Context;
import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oi */
/* loaded from: classes2.dex */
public final class C8430oi {
    public final Context a;
    public final C1193Je2 b;
    public final Profile c = Profile.d();
    public final PropertyModel d;

    public C8430oi(Context context, C1193Je2 c1193Je2) {
        this.a = context;
        this.b = c1193Je2;
        FD2[] fd2Arr = AbstractC8773pi.f;
        if (c1193Je2 == null) {
            this.d = new PropertyModel(PropertyModel.e(fd2Arr));
            return;
        }
        HashMap e = PropertyModel.e(fd2Arr);
        ND2 nd2 = AbstractC8773pi.a;
        int a = a(b(nd2));
        DD2 dd2 = new DD2();
        dd2.a = a;
        e.put(nd2, dd2);
        ND2 nd22 = AbstractC8773pi.b;
        int a2 = a(b(nd22));
        DD2 dd22 = new DD2();
        dd22.a = a2;
        e.put(nd22, dd22);
        ND2 nd23 = AbstractC8773pi.c;
        int a3 = a(b(nd23));
        DD2 dd23 = new DD2();
        dd23.a = a3;
        e.put(nd23, dd23);
        ND2 nd24 = AbstractC8773pi.d;
        int a4 = a(b(nd24));
        DD2 dd24 = new DD2();
        dd24.a = a4;
        e.put(nd24, dd24);
        PD2 pd2 = AbstractC8773pi.e;
        C8086ni c8086ni = new C8086ni(this);
        GD2 gd2 = new GD2();
        gd2.a = c8086ni;
        this.d = AbstractC5266fV2.a(e, pd2, gd2, e);
    }

    public final int a(int i) {
        String c1193Je2 = this.b.toString();
        return Integer.valueOf(N.MrCE1oma(this.c, i, c1193Je2, c1193Je2)).intValue();
    }

    public static int b(FD2 fd2) {
        if (fd2 == AbstractC8773pi.a) {
            return 5;
        }
        if (fd2 == AbstractC8773pi.b) {
            return 8;
        }
        if (fd2 == AbstractC8773pi.c) {
            return 9;
        }
        return fd2 == AbstractC8773pi.d ? 4 : -1;
    }
}
