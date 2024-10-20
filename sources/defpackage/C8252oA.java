package defpackage;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import org.chromium.chrome.browser.app.bookmarks.BookmarkActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkActionBar;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oA */
/* loaded from: classes.dex */
public final class C8252oA implements InterfaceC1944Oz, InterfaceC3746b33, InterfaceC0828Gj2 {
    public final C6532jA A;
    public final Context a;
    public final ComponentName g;
    public final ViewGroup h;
    public C8938qA i;
    public SA j;
    public AbstractC5426fx l;
    public final SelectableListLayout m;
    public final RecyclerView n;
    public final BookmarkActionBar o;
    public final C6876kA p;
    public LargeIconBridge r;
    public boolean s;
    public String t;
    public final boolean u;
    public final boolean v;
    public boolean w;
    public final C5158fA x;
    public final C7908nA y;
    public final C7220lA z;
    public final C12157za2 k = new C12157za2();
    public final Stack q = new Stack();

    public C8252oA(Context context, ComponentName componentName, boolean z, boolean z2, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        C6532jA c6532jA = new C6532jA(this);
        this.A = c6532jA;
        this.a = context;
        this.g = componentName;
        this.u = z;
        this.v = z2;
        C6876kA c6876kA = new C6876kA(this);
        this.p = c6876kA;
        this.y = new C7908nA(this);
        this.i = new C8938qA();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0067, (ViewGroup) null);
        this.h = viewGroup;
        if (V83.a()) {
            C8938qA c8938qA = this.i;
            new C8372oY();
            C3063Xo3 c3063Xo3 = C8372oY.a().a;
            if (c3063Xo3 != null && c8938qA != null) {
                RunnableC1807Nx2 runnableC1807Nx2 = new RunnableC1807Nx2(c8938qA, c3063Xo3);
                if (c8938qA.d) {
                    runnableC1807Nx2.run();
                } else {
                    c8938qA.b(new C2587Tx2(runnableC1807Nx2, c8938qA));
                }
            }
        }
        SelectableListLayout selectableListLayout = (SelectableListLayout) viewGroup.findViewById(R.id.selectable_list);
        this.m = selectableListLayout;
        selectableListLayout.o = R.string.0_resource_name_obfuscated_res_0x7f1402b0;
        selectableListLayout.h.setText(R.string.0_resource_name_obfuscated_res_0x7f1402b0);
        selectableListLayout.i.setOnTouchListener(new W23());
        C5158fA c5158fA = new C5158fA(context, viewOnClickListenerC1069If3);
        this.x = c5158fA;
        C7220lA c7220lA = new C7220lA(this);
        this.z = c7220lA;
        c5158fA.J(c7220lA);
        this.n = selectableListLayout.f(c5158fA, null);
        BookmarkActionBar bookmarkActionBar = (BookmarkActionBar) selectableListLayout.i(R.layout.0_resource_name_obfuscated_res_0x7f0e0061, c6876kA, 0, R.id.normal_menu_group, R.id.selection_mode_menu_group, null, z);
        this.o = bookmarkActionBar;
        bookmarkActionBar.K(this, R.string.0_resource_name_obfuscated_res_0x7f140293, R.id.search_menu_id);
        selectableListLayout.c();
        this.j = new SA(context, this.i, viewOnClickListenerC1069If3, false);
        this.i.b(c6532jA);
        bookmarkActionBar.G(null);
        bookmarkActionBar.M(0);
        bookmarkActionBar.o().findItem(R.id.search_menu_id).setVisible(false);
        bookmarkActionBar.o().findItem(R.id.edit_menu_id).setVisible(false);
        QA qa = new QA();
        qa.a = 1;
        qa.b = "";
        h(qa);
        this.i.e(new Runnable() { // from class: iA
            @Override // java.lang.Runnable
            public final void run() {
                QA b;
                C8252oA c8252oA = C8252oA.this;
                final C7908nA c7908nA = c8252oA.y;
                c7908nA.a = c8252oA;
                c7908nA.b = c8252oA.p;
                AccessibilityManager accessibilityManager = (AccessibilityManager) c7908nA.e.m.getContext().getSystemService("accessibility");
                c7908nA.c = accessibilityManager;
                c7908nA.d = accessibilityManager.isEnabled();
                AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: mA
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z3) {
                        C7908nA.this.d = z3;
                    }
                };
                c7908nA.getClass();
                c7908nA.c.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
                C5158fA c5158fA2 = c8252oA.x;
                c5158fA2.v = c8252oA;
                C12157za2 c12157za2 = c8252oA.k;
                c12157za2.a(c5158fA2);
                ((C8252oA) c5158fA2.v).i.b(c5158fA2.C);
                ((C8252oA) c5158fA2.v).p.a(c5158fA2);
                c5158fA2.w = new C10995wA(c5158fA2.i, new Runnable() { // from class: Zz
                    public /* synthetic */ RunnableC3374Zz() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C5158fA.this.X(true);
                    }
                });
                c5158fA2.V();
                c5158fA2.k = new ArrayList();
                c5158fA2.o = c7908nA;
                c5158fA2.t();
                BookmarkActionBar bookmarkActionBar2 = c8252oA.o;
                bookmarkActionBar2.C0 = c8252oA;
                c12157za2.a(bookmarkActionBar2);
                if (!c8252oA.u) {
                    bookmarkActionBar2.o().removeItem(R.id.close_menu_id);
                }
                bookmarkActionBar2.o().setGroupEnabled(R.id.selection_mode_menu_group, true);
                c5158fA2.q.a(bookmarkActionBar2);
                if (!TextUtils.isEmpty(c8252oA.t)) {
                    String str = c8252oA.t;
                    C8938qA c8938qA2 = c8252oA.i;
                    if ("chrome-native://bookmarks/folder//shopping".equals(str)) {
                        b = new QA();
                        b.a = 2;
                        b.b = "chrome-native://bookmarks/folder//shopping";
                        b.c = BookmarkId.c;
                    } else {
                        b = QA.b(Uri.parse(str), c8938qA2);
                    }
                    c8252oA.h(b);
                }
                C1088Ij2.j.add(c8252oA);
            }
        });
        this.r = new LargeIconBridge(Profile.d());
        int min = Math.min((((ActivityManager) V60.a.getSystemService("activity")).getMemoryClass() / 4) * 1048576, 10485760);
        LargeIconBridge largeIconBridge = this.r;
        largeIconBridge.getClass();
        largeIconBridge.c = new C9892sx1(min);
        FI2.a("MobileBookmarkManagerOpen");
        if (z) {
            return;
        }
        FI2.a("MobileBookmarkManagerPageOpen");
    }

    public final void e() {
        this.x.L(this.z);
        this.w = true;
        FI2.a("MobileBookmarkManagerClose");
        this.m.j();
        Iterator it = this.k.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((PA) c11814ya2.next()).onDestroy();
            }
        }
        SA sa = this.j;
        if (sa != null) {
            sa.j();
            this.j = null;
        }
        this.i.o(this.A);
        this.i.c();
        this.i = null;
        this.r.a();
        this.r = null;
        C1088Ij2.j.remove(this);
    }

    public final void j(String str) {
        QA b;
        C8938qA c8938qA = this.i;
        if (c8938qA == null) {
            return;
        }
        if (c8938qA.d) {
            Stack stack = this.q;
            QA qa = (stack.isEmpty() || ((QA) stack.peek()).a != 3) ? null : (QA) stack.pop();
            C8938qA c8938qA2 = this.i;
            if ("chrome-native://bookmarks/folder//shopping".equals(str)) {
                b = new QA();
                b.a = 2;
                b.b = "chrome-native://bookmarks/folder//shopping";
                b.c = BookmarkId.c;
            } else {
                b = QA.b(Uri.parse(str), c8938qA2);
            }
            h(b);
            if (qa != null) {
                h(qa);
                return;
            }
            return;
        }
        this.t = str;
    }

    public final void h(QA qa) {
        if (!qa.c(this.i)) {
            qa = QA.a(this.i, this.i.t());
        }
        Stack stack = this.q;
        if (stack.isEmpty() || !((QA) stack.peek()).equals(qa)) {
            if (!stack.isEmpty() && ((QA) stack.peek()).a == 1) {
                stack.pop();
            }
            stack.push(qa);
            d(qa);
        }
    }

    public final void d(QA qa) {
        if (qa.a == 2) {
            O83.a.t("enhanced_bookmark_last_used_url", qa.b);
            AbstractC5426fx abstractC5426fx = this.l;
            if (abstractC5426fx != null) {
                String str = qa.b;
                if (!str.equals(abstractC5426fx.k)) {
                    LoadUrlParams loadUrlParams = new LoadUrlParams(str, 0);
                    loadUrlParams.o = false;
                    abstractC5426fx.a.b(loadUrlParams, false);
                }
            }
        }
        Iterator it = this.k.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                c((PA) c11814ya2.next());
            }
        }
    }

    public static void a(C8252oA c8252oA) {
        C6876kA c6876kA = c8252oA.p;
        Iterator it = c6876kA.c().iterator();
        while (it.hasNext()) {
            BookmarkId bookmarkId = (BookmarkId) it.next();
            if (c6876kA.d(bookmarkId) && c8252oA.x.T(bookmarkId) == -1) {
                c6876kA.g(bookmarkId);
            }
        }
    }

    public final void g(BookmarkId bookmarkId) {
        FI2.a("MobileBookmarkManagerOpenFolder");
        BookmarkActionBar bookmarkActionBar = this.o;
        if (bookmarkActionBar.b0) {
            bookmarkActionBar.I();
        }
        h(QA.a(this.i, bookmarkId));
        this.n.m0(0);
    }

    public final void c(PA pa) {
        int b = b();
        if (b != 1) {
            if (b == 2) {
                pa.g(((QA) this.q.peek()).c);
            } else {
                if (b != 3) {
                    return;
                }
                pa.h();
            }
        }
    }

    public final void f(BookmarkId bookmarkId) {
        boolean z;
        boolean M6bsIDpc;
        C8938qA c8938qA = this.i;
        BookmarkBridge.BookmarkItem f = c8938qA.f(bookmarkId);
        Context context = this.a;
        if (f == null) {
            z = false;
        } else {
            FI2.a("MobileBookmarkManagerEntryOpened");
            EI2.h(bookmarkId.getType(), 3, "Bookmarks.OpenBookmarkType");
            BookmarkBridge.BookmarkItem f2 = c8938qA.f(bookmarkId);
            int type = bookmarkId.getType();
            EI2.g("Bookmarks.OpenBookmarkTimeInterval2.".concat(type != 0 ? type != 1 ? type != 2 ? "" : "ReadingList" : "Partner" : "Normal"), System.currentTimeMillis() - f2.h, 1L, 2592000000L, 50);
            int type2 = f2.c.getType();
            ComponentName componentName = this.g;
            boolean z2 = this.v;
            GURL gurl = f2.b;
            if (type2 == 2 && !f2.d) {
                String i = gurl.i();
                if (RH2.a()) {
                    C7928nE c7928nE = UN.a;
                    M6bsIDpc = N.M6bsIDpc("ReadLater", "use_cct", true);
                } else {
                    M6bsIDpc = true;
                }
                if (!M6bsIDpc) {
                    WA.e(context, i, componentName, DeviceFormFactor.a(context) ? null : 18, z2);
                } else {
                    C3140Ye0 c3140Ye0 = new C3140Ye0();
                    c3140Ye0.d();
                    c3140Ye0.c(1);
                    C3270Ze0 a = c3140Ye0.a();
                    Uri parse = Uri.parse(i);
                    Intent intent = a.a;
                    intent.setData(parse);
                    Intent e = C0507Dx1.e(context, intent);
                    e.setPackage(context.getPackageName());
                    e.putExtra("com.android.browser.application_id", context.getPackageName());
                    e.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE", 6);
                    if (z2) {
                        e.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
                        e.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_INCOGNITO_CCT_CALLER_ID", 4);
                    }
                    AbstractC2281Ro1.a(e);
                    e.addFlags(268435456);
                    C1761No1.y(null, e, null);
                }
                N.Mj0PtWvo(c8938qA.c, c8938qA, gurl, true);
            } else {
                WA.e(context, gurl.i(), componentName, null, z2);
            }
            z = true;
        }
        if (z && bookmarkId != null && bookmarkId.getType() != 2 && (context instanceof BookmarkActivity)) {
            ((Activity) context).finish();
        }
    }

    public final int b() {
        Stack stack = this.q;
        if (stack.isEmpty()) {
            return 1;
        }
        return ((QA) stack.peek()).a;
    }

    @Override // defpackage.InterfaceC3746b33
    public final void l(String str) {
        C5158fA c5158fA = this.x;
        c5158fA.getClass();
        String trim = str.trim();
        c5158fA.x = trim;
        c5158fA.W(((C8252oA) c5158fA.v).i.p(trim, 0, 500));
    }

    @Override // defpackage.InterfaceC3746b33
    public final void i() {
        this.m.k();
        Stack stack = this.q;
        stack.pop();
        h((QA) stack.pop());
    }
}
