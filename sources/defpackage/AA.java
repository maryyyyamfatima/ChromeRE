package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AA extends S23 implements PA {
    public ListMenuButton F;
    public C1844Of G;
    public InterfaceC1944Oz H;
    public BookmarkId I;

    /* renamed from: J */
    public boolean f11434J;
    public C11338xA K;
    public int L;
    public boolean M;

    @Override // defpackage.PA
    public final void g(BookmarkId bookmarkId) {
    }

    @Override // defpackage.PA
    public final void h() {
    }

    public AA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (AbstractC2464Sz.a()) {
            Resources resources = getResources();
            boolean z = false;
            if (AbstractC2464Sz.a()) {
                C7928nE c7928nE = UN.a;
                if (N.M6bsIDpc("BookmarksRefresh", "bookmark_compact_visuals_enabled", false)) {
                    z = true;
                }
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(z ? R.dimen.0_resource_name_obfuscated_res_0x7f0803b8 : R.dimen.0_resource_name_obfuscated_res_0x7f0803b7);
            this.C = true;
            this.q = dimensionPixelSize;
            this.A = R.drawable.0_resource_name_obfuscated_res_0x7f090372;
            this.z = R.layout.0_resource_name_obfuscated_res_0x7f0e0188;
            if (this.B) {
                removeAllViews();
                q();
            }
        }
    }

    public BookmarkBridge.BookmarkItem v(BookmarkId bookmarkId, int i, boolean z) {
        this.L = i;
        this.I = bookmarkId;
        this.M = z;
        BookmarkBridge.BookmarkItem f = ((C8252oA) this.H).i.f(bookmarkId);
        this.F.d();
        AbstractC4433d33.a(getContext(), this.F, f.a, 0);
        setChecked(u());
        w();
        k(bookmarkId);
        return f;
    }

    public final void w() {
        BookmarkBridge.BookmarkItem f;
        BookmarkId bookmarkId = this.I;
        if (bookmarkId == null || (f = ((C8252oA) this.H).i.f(bookmarkId)) == null) {
            return;
        }
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        if (((C8252oA) this.H).y.a()) {
            C1844Of c1844Of = this.G;
            if (f.c() && !this.M) {
                r2 = 0;
            }
            c1844Of.setVisibility(r2);
            this.G.setEnabled(u());
            return;
        }
        this.F.setVisibility(f.a() ? 0 : 8);
        this.F.setClickable(!this.h.e());
        ListMenuButton listMenuButton = this.F;
        listMenuButton.setEnabled(listMenuButton.isClickable());
        ListMenuButton listMenuButton2 = this.F;
        listMenuButton2.setImportantForAccessibility(listMenuButton2.isClickable() ? 1 : 2);
    }

    public final void t() {
        this.F.d();
        ListMenuButton listMenuButton = this.F;
        listMenuButton.n.d(this.K);
        InterfaceC1944Oz interfaceC1944Oz = this.H;
        if (interfaceC1944Oz != null) {
            ((C8252oA) interfaceC1944Oz).k.d(this);
        }
    }

    @Override // defpackage.S23, defpackage.U23, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e016b, this.r);
        ListMenuButton listMenuButton = (ListMenuButton) findViewById(R.id.more);
        this.F = listMenuButton;
        listMenuButton.e(new ZC1() { // from class: yA
            @Override // defpackage.ZC1
            public final /* synthetic */ LI2 a(View view) {
                return YC1.a(view);
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // defpackage.ZC1
            public final defpackage.TC1 b() {
                /*
                    r12 = this;
                    AA r0 = defpackage.AA.this
                    Oz r1 = r0.H
                    r2 = 0
                    if (r1 == 0) goto L27
                    oA r1 = (defpackage.C8252oA) r1
                    qA r1 = r1.i
                    if (r1 == 0) goto L27
                    org.chromium.components.bookmarks.BookmarkId r3 = r0.I
                    org.chromium.chrome.browser.bookmarks.BookmarkBridge$BookmarkItem r1 = r1.f(r3)
                    if (r1 == 0) goto L28
                    boolean r3 = r1.b()
                    boolean r4 = r1.c()
                    if (r4 == 0) goto L25
                    boolean r4 = r0.M
                    if (r4 != 0) goto L25
                    r4 = 1
                    goto L2a
                L25:
                    r4 = r2
                    goto L2a
                L27:
                    r1 = 0
                L28:
                    r3 = r2
                    r4 = r3
                L2a:
                    mK1 r5 = new mK1
                    r5.<init>()
                    org.chromium.components.bookmarks.BookmarkId r6 = r0.I
                    int r6 = r6.getType()
                    r7 = 2132017815(0x7f140297, float:1.967392E38)
                    r8 = 2132017817(0x7f140299, float:1.9673923E38)
                    r9 = 2132017816(0x7f140298, float:1.9673921E38)
                    r10 = 2132017818(0x7f14029a, float:1.9673925E38)
                    r11 = 2
                    if (r6 != r11) goto L77
                    if (r1 == 0) goto L54
                    boolean r1 = r1.i
                    if (r1 != 0) goto L54
                    r1 = 2132019509(0x7f140935, float:1.9677355E38)
                    lK1 r1 = defpackage.C4738dx.d(r1, r2, r2)
                    r5.s(r1)
                L54:
                    lK1 r1 = defpackage.C4738dx.d(r10, r2, r2)
                    r5.s(r1)
                    lK1 r1 = defpackage.C4738dx.d(r7, r2, r2)
                    r5.s(r1)
                    boolean r1 = defpackage.RH2.b()
                    if (r1 == 0) goto L93
                    lK1 r1 = defpackage.C4738dx.d(r9, r2, r2)
                    r5.s(r1)
                    lK1 r1 = defpackage.C4738dx.d(r8, r2, r2)
                    r5.s(r1)
                    goto L93
                L77:
                    lK1 r1 = defpackage.C4738dx.d(r10, r2, r2)
                    r5.s(r1)
                    lK1 r1 = defpackage.C4738dx.d(r9, r2, r2)
                    r5.s(r1)
                    lK1 r1 = defpackage.C4738dx.e(r8, r2, r2, r3)
                    r5.s(r1)
                    lK1 r1 = defpackage.C4738dx.d(r7, r2, r2)
                    r5.s(r1)
                L93:
                    Oz r1 = r0.H
                    oA r1 = (defpackage.C8252oA) r1
                    int r1 = r1.b()
                    r3 = 3
                    if (r1 != r3) goto La9
                    r1 = 2132017832(0x7f1402a8, float:1.9673954E38)
                    lK1 r1 = defpackage.C4738dx.d(r1, r2, r2)
                    r5.s(r1)
                    goto Ld3
                La9:
                    Oz r1 = r0.H
                    oA r1 = (defpackage.C8252oA) r1
                    int r1 = r1.b()
                    if (r1 != r11) goto Ld3
                    int r1 = r0.L
                    if (r1 == r3) goto Ld3
                    if (r4 == 0) goto Ld3
                    if (r1 == 0) goto Lc5
                    r1 = 2132018733(0x7f14062d, float:1.967578E38)
                    lK1 r1 = defpackage.C4738dx.d(r1, r2, r2)
                    r5.s(r1)
                Lc5:
                    int r1 = r0.L
                    if (r1 == r11) goto Ld3
                    r1 = 2132018731(0x7f14062b, float:1.9675777E38)
                    lK1 r1 = defpackage.C4738dx.d(r1, r2, r2)
                    r5.s(r1)
                Ld3:
                    zA r1 = new zA
                    r1.<init>()
                    dx r2 = new dx
                    android.content.Context r0 = r0.getContext()
                    r2.<init>(r0, r5, r1)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C11681yA.b():TC1");
            }
        }, true);
        C1844Of c1844Of = this.u;
        this.G = c1844Of;
        c1844Of.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0901ee);
        this.G.setImageTintList(Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f07012b));
    }

    @Override // defpackage.U23, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11434J = true;
        InterfaceC1944Oz interfaceC1944Oz = this.H;
        if (interfaceC1944Oz != null) {
            ((C8252oA) interfaceC1944Oz).k.a(this);
            C11338xA c11338xA = new C11338xA(this);
            this.K = c11338xA;
            this.F.n.a(c11338xA);
        }
    }

    @Override // defpackage.U23, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11434J = false;
        t();
    }

    @Override // defpackage.U23, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        super.d(arrayList);
        w();
    }

    @Override // defpackage.PA
    public void onDestroy() {
        t();
    }

    public final boolean u() {
        return ((C8252oA) this.H).p.d(this.I);
    }

    @Override // defpackage.U23, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (((C8252oA) this.H).y.a()) {
            n((BookmarkId) this.i);
            FI2.a("MobileBookmarkManagerTapToggleSelect");
        } else {
            super.onClick(view);
        }
    }

    @Override // defpackage.U23, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (((C8252oA) this.H).y.a() && u()) {
            return true;
        }
        FI2.a("MobileBookmarkManagerLongPressToggleSelect");
        super.onLongClick(view);
        return true;
    }
}
