package defpackage;

import J.N;
import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YL3 implements G60, View.OnClickListener, View.OnCreateContextMenuListener {
    public final C7722me3 a;
    public Runnable g;
    public Runnable h;
    public final /* synthetic */ ZL3 i;

    @Override // defpackage.G60
    public final void d() {
    }

    @Override // defpackage.G60
    public final void a(int i) {
        C7722me3 c7722me3 = this.a;
        ZL3 zl3 = this.i;
        PL3 a = zl3.a(c7722me3);
        if (a == null) {
            return;
        }
        zl3.c.a(i, a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [XL3] */
    @Override // defpackage.G60
    public final void b() {
        ZL3 zl3 = this.i;
        C7722me3 c7722me3 = this.a;
        PL3 a = zl3.a(c7722me3);
        if (a == null) {
            return;
        }
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        zl3.j = c7722me3.b;
        ?? r1 = new Callback() { // from class: XL3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                YL3.this.i.k = (GURL) obj;
            }
        };
        C3848bM3 c3848bM3 = (C3848bM3) zl3.c;
        MostVisitedSitesBridge mostVisitedSitesBridge = c3848bM3.d;
        C7722me3 c7722me32 = a.a;
        GURL gurl = c7722me32.b;
        long j = mostVisitedSitesBridge.a;
        if (j != 0) {
            N.MQm3a0t7(j, mostVisitedSitesBridge, gurl, true);
        }
        if (c3848bM3.f == null) {
            c3848bM3.f = new C3504aM3(c3848bM3, r1);
        }
        Context context = c3848bM3.a;
        C12188zf3 a2 = C12188zf3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14066b), c3848bM3.f, 0, 2);
        a2.d = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
        a2.e = c7722me32.b;
        c3848bM3.b.c(a2);
    }

    @Override // defpackage.G60
    public final void c() {
        C7722me3 c7722me3 = this.a;
        ZL3 zl3 = this.i;
        PL3 a = zl3.a(c7722me3);
        if (a == null) {
            return;
        }
        C3848bM3 c3848bM3 = (C3848bM3) zl3.c;
        c3848bM3.getClass();
        String i = a.a.b.i();
        c3848bM3.d(a);
        c3848bM3.c.f(i, 4, true);
        AbstractC9999tG2.c("Chrome.Querytiles.RecentMvClicks");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ZL3 zl3 = this.i;
        PL3 a = zl3.a(this.a);
        if (a == null) {
            return;
        }
        FI2.a("Suggestions.Tile.Tapped");
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        zl3.c.a(1, a);
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.i.b.a(contextMenu, view, this);
    }

    public YL3(ZL3 zl3, C7722me3 c7722me3) {
        this.i = zl3;
        this.a = c7722me3;
    }

    @Override // defpackage.G60
    public final GURL getUrl() {
        return this.a.b;
    }

    @Override // defpackage.G60
    public final boolean e(int i) {
        C7722me3 c7722me3 = this.a;
        if (i == 3) {
            return c7722me3.d != 6;
        }
        if (i != 7) {
            return true;
        }
        return c7722me3.e == 1 && c7722me3.d != 6;
    }
}
