package org.chromium.content.browser;

import defpackage.AbstractC10647v90;
import defpackage.B9;
import defpackage.C0077Ap1;
import defpackage.C10874vp1;
import defpackage.C11445xV1;
import defpackage.C11903yp1;
import defpackage.C5840h9;
import defpackage.W14;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InterfaceRegistrarImpl {
    public static boolean a;

    public static void createInterfaceRegistry(long j) {
        a();
        CoreImpl coreImpl = AbstractC10647v90.a;
        coreImpl.getClass();
        C0077Ap1 e = C0077Ap1.e(new C11445xV1(new W14(coreImpl, j)));
        C10874vp1 c10874vp1 = C10874vp1.b;
        if (c10874vp1 == null) {
            return;
        }
        c10874vp1.a(e, null);
    }

    public static void createInterfaceRegistryForWebContents(long j, WebContents webContents) {
        a();
        CoreImpl coreImpl = AbstractC10647v90.a;
        coreImpl.getClass();
        C0077Ap1 e = C0077Ap1.e(new C11445xV1(new W14(coreImpl, j)));
        C10874vp1 c10874vp1 = C10874vp1.c;
        if (c10874vp1 == null) {
            return;
        }
        c10874vp1.a(e, webContents);
    }

    public static void createInterfaceRegistryForRenderFrameHost(long j, RenderFrameHost renderFrameHost) {
        a();
        CoreImpl coreImpl = AbstractC10647v90.a;
        coreImpl.getClass();
        C0077Ap1 e = C0077Ap1.e(new C11445xV1(new W14(coreImpl, j)));
        C10874vp1 c10874vp1 = C10874vp1.d;
        if (c10874vp1 == null) {
            return;
        }
        c10874vp1.a(e, renderFrameHost);
    }

    public static void a() {
        if (a) {
            return;
        }
        a = true;
        C11903yp1 c11903yp1 = new C11903yp1();
        if (C10874vp1.b == null) {
            C10874vp1.b = new C10874vp1();
        }
        C10874vp1.b.a.add(c11903yp1);
    }

    public static void createInterfaceRegistryOnIOThread(long j) {
        CoreImpl coreImpl = AbstractC10647v90.a;
        coreImpl.getClass();
        C0077Ap1.e(new C11445xV1(new W14(coreImpl, j))).c(B9.a, new C5840h9());
    }
}
