package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jE2 */
/* loaded from: classes.dex */
public final class C6555jE2 {
    public final HashMap a;
    public final HashMap b;
    public final Executor c;
    public final C3694au3 d;
    public final InterfaceC5544gI1 e;
    public final InterfaceC3299Zk f;
    public final Map g;

    public final C5869hE2 b(C11895yo c11895yo) {
        XF0 c;
        AbstractC10997wA1 c10311uA1;
        Uri uri = c11895yo.a;
        uri.isHierarchical();
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        (lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb");
        c11895yo.e.getClass();
        AbstractC9517rr4 abstractC9517rr4 = (AbstractC9517rr4) this.g.get("singleproc");
        Uri uri2 = c11895yo.a;
        String lastPathSegment2 = uri2.getLastPathSegment();
        String str = lastPathSegment2 != null ? lastPathSegment2 : "";
        int lastIndexOf2 = str.lastIndexOf(46);
        if (lastIndexOf2 != -1) {
            str = str.substring(0, lastIndexOf2);
        }
        String str2 = str;
        C0 e = AbstractC5957hW0.e(AbstractC5957hW0.c(uri2), this.f, EnumC6747jo0.a);
        Executor executor = this.c;
        C3694au3 c3694au3 = this.d;
        ((C2743Vc3) abstractC9517rr4).getClass();
        if (c11895yo.f) {
            c = XF0.d();
        } else {
            c = XF0.c();
        }
        C12238zo c12238zo = new C12238zo(c11895yo.b, c);
        C9803si1 c2 = AbstractC5957hW0.c(uri2);
        AbstractC7720me1 abstractC7720me1 = c11895yo.c;
        boolean z = c11895yo.g;
        if (!z) {
            c10311uA1 = new C10311uA1();
        } else {
            c10311uA1 = new C10654vA1();
        }
        C5869hE2 c5869hE2 = new C5869hE2(new C3003Xc3(str2, c2, c12238zo, executor, c3694au3, abstractC7720me1, c10311uA1), this.e, e, z);
        AbstractC0562Ei1 abstractC0562Ei1 = c11895yo.d;
        if (!abstractC0562Ei1.isEmpty()) {
            C5525gE2 c5525gE2 = new C5525gE2(abstractC0562Ei1, this.c);
            synchronized (c5869hE2.h) {
                c5869hE2.j.add(c5525gE2);
            }
        }
        return c5869hE2;
    }

    public C6555jE2(Executor executor, C3694au3 c3694au3, HashMap hashMap) {
        C9253r52 c9253r52 = C9253r52.a;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = executor;
        this.d = c3694au3;
        this.e = c9253r52;
        this.g = hashMap;
        hashMap.isEmpty();
        this.f = new InterfaceC3299Zk() { // from class: iE2
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj) {
                return AbstractC5957hW0.c("");
            }
        };
    }

    public static void a(C11895yo c11895yo, C11895yo c11895yo2) {
        if (c11895yo.equals(c11895yo2)) {
            return;
        }
        MessageLite messageLite = c11895yo.b;
        Uri uri = c11895yo.a;
        String a = AbstractC12236zn3.a("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", messageLite.getClass().getSimpleName(), uri);
        uri.equals(c11895yo2.a);
        messageLite.equals(c11895yo2.b);
        c11895yo.c.equals(c11895yo2.c);
        c11895yo.d.equals(c11895yo2.d);
        c11895yo.e.equals(c11895yo2.e);
        throw new IllegalArgumentException(AbstractC12236zn3.a(a, "unknown"));
    }
}
