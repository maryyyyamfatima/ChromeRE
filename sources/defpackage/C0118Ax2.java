package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ax2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118Ax2 implements InterfaceC1323Ke2 {
    public final C11608xx2 a = new C11608xx2(this);
    public final AbstractServiceConnectionC0378Cx2 b;
    public WebContents c;
    public MessagePort[] d;
    public Uri e;

    public C0118Ax2(C2880We0 c2880We0) {
        this.b = c2880We0;
    }

    @Override // defpackage.InterfaceC1323Ke2
    public final void a(String str, C1193Je2 c1193Je2, boolean z, Boolean bool) {
        if (z) {
            c(Uri.parse("android-app://" + c1193Je2.a.getHost() + "/" + str));
        }
    }

    public final void d(WebContents webContents) {
        MessagePort[] h1 = webContents.h1();
        this.d = h1;
        h1[0].b(this.a);
        webContents.g0(new C9045qV1(""), this.e.toString(), new MessagePort[]{this.d[1]});
        AbstractServiceConnectionC0378Cx2 abstractServiceConnectionC0378Cx2 = this.b;
        abstractServiceConnectionC0378Cx2.j = true;
        if (abstractServiceConnectionC0378Cx2.h == null) {
            return;
        }
        synchronized (abstractServiceConnectionC0378Cx2.a) {
            try {
                try {
                    abstractServiceConnectionC0378Cx2.h.Y0(abstractServiceConnectionC0378Cx2.g, null);
                } catch (RemoteException unused) {
                }
            } finally {
            }
        }
    }

    public final void b() {
        MessagePort[] messagePortArr = this.d;
        if (messagePortArr == null) {
            return;
        }
        messagePortArr[0].close();
        this.d = null;
        this.c = null;
        Context context = V60.a;
        AbstractServiceConnectionC0378Cx2 abstractServiceConnectionC0378Cx2 = this.b;
        if (abstractServiceConnectionC0378Cx2.h != null) {
            context.unbindService(abstractServiceConnectionC0378Cx2);
            abstractServiceConnectionC0378Cx2.h = null;
        }
    }

    public final void c(Uri uri) {
        this.e = uri;
        WebContents webContents = this.c;
        if (webContents == null || webContents.isDestroyed()) {
            return;
        }
        d(this.c);
    }
}
