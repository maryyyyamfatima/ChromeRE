package org.chromium.content.browser.selection;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Magnifier;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC10922vx2;
import defpackage.AbstractC3017Xf2;
import defpackage.AbstractC3226Yv1;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6846k5;
import defpackage.C10191tp4;
import defpackage.C10271u33;
import defpackage.C10614v33;
import defpackage.C10634v7;
import defpackage.C11265wx2;
import defpackage.C11419xQ0;
import defpackage.C11762yQ0;
import defpackage.C2493Te3;
import defpackage.C5473g50;
import defpackage.C5808h33;
import defpackage.C6600jN2;
import defpackage.C8385oa2;
import defpackage.C8551p23;
import defpackage.C8647pK1;
import defpackage.C9242r33;
import defpackage.C9675sK1;
import defpackage.C9928t33;
import defpackage.FI2;
import defpackage.InterfaceC10236tx2;
import defpackage.InterfaceC6152i33;
import defpackage.InterfaceC8775pi1;
import defpackage.InterfaceC9163qp4;
import defpackage.J44;
import defpackage.K44;
import defpackage.RunnableC9585s33;
import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SelectionPopupControllerImpl extends AbstractC6846k5 implements InterfaceC8775pi1, InterfaceC9163qp4, InterfaceC10236tx2, J44 {
    public static boolean N;
    public String A;
    public int B;
    public boolean C;
    public boolean D;
    public C11762yQ0 E;
    public boolean F;
    public InterfaceC6152i33 G;
    public C2493Te3 H;
    public C11265wx2 I;

    /* renamed from: J */
    public C5808h33 f11539J;
    public boolean K;
    public C8647pK1 L;
    public final C10634v7 M;
    public Context h;
    public WindowAndroid i;
    public final WebContentsImpl j;
    public ActionMode.Callback2 k;
    public RenderFrameHost l;
    public long m;
    public final C10614v33 n;
    public final RunnableC9585s33 p;
    public final View q;
    public ActionMode r;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Rect o = new Rect();
    public final C8385oa2 s = new C8385oa2();
    public final Handler g = new Handler();

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public final void s() {
        Object obj = ThreadUtils.a;
        if (C5473g50.a == null) {
            C5473g50.a = new C5473g50();
        }
        C5473g50 c5473g50 = C5473g50.a;
        C9242r33 c9242r33 = new C9242r33(this);
        c5473g50.getClass();
        this.L = Build.VERSION.SDK_INT < 28 ? null : new C8647pK1(new C9675sK1(c9242r33));
    }

    public static SelectionPopupControllerImpl k(WebContents webContents) {
        K44 x;
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        J44 j44 = null;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(SelectionPopupControllerImpl.class);
            if (b == null) {
                SelectionPopupControllerImpl selectionPopupControllerImpl = new SelectionPopupControllerImpl(webContentsImpl);
                selectionPopupControllerImpl.k = AbstractC6846k5.a;
                b = x.d(SelectionPopupControllerImpl.class, selectionPopupControllerImpl);
            }
            j44 = (J44) SelectionPopupControllerImpl.class.cast(b);
        }
        return (SelectionPopupControllerImpl) j44;
    }

    public SelectionPopupControllerImpl(WebContentsImpl webContentsImpl) {
        this.j = webContentsImpl;
        this.I = null;
        this.h = webContentsImpl.t();
        this.i = webContentsImpl.Q0();
        ViewAndroidDelegate C = webContentsImpl.C();
        if (C != null) {
            this.q = C.getContainerView();
            C.d.a(this);
        }
        this.t = 7;
        this.p = new RunnableC9585s33(this);
        C10191tp4 e = C10191tp4.e(webContentsImpl);
        if (e != null) {
            e.b(this);
        }
        this.m = N.MJHXNa8U(this, webContentsImpl);
        ImeAdapterImpl b = ImeAdapterImpl.b(webContentsImpl);
        if (b != null) {
            b.n.add(this);
        }
        this.n = new C10614v33(this);
        this.A = "";
        s();
        Object obj = ThreadUtils.a;
        if (C5473g50.a == null) {
            C5473g50.a = new C5473g50();
        }
        C5473g50.a.getClass();
        this.M = Build.VERSION.SDK_INT >= 28 ? new C10634v7() : null;
        if (this.I == null) {
            this.I = (C11265wx2) webContentsImpl.v(C11265wx2.class, AbstractC10922vx2.a);
        }
        this.I.a.add(this);
    }

    public static String x(int i, String str) {
        if (TextUtils.isEmpty(str) || str.length() < i) {
            return str;
        }
        AbstractC4851eH1.f("SelectionPopupCtlr", "Truncating oversized query (" + str.length() + ").", new Object[0]);
        return str.substring(0, i) + "…";
    }

    public final boolean t() {
        return this.r != null;
    }

    public final void z() {
        View view;
        if ((this.k != AbstractC6846k5.a) && this.D && (view = this.q) != null) {
            if (t()) {
                if (!(t() && this.r.getType() == 1)) {
                    try {
                        this.r.invalidate();
                    } catch (NullPointerException e) {
                        AbstractC4851eH1.f("SelectionPopupCtlr", "Ignoring NPE from ActionMode.invalidate() as workaround for L", e);
                    }
                    r(false);
                    return;
                }
            }
            this.z = false;
            j();
            ActionMode startActionMode = view.startActionMode(this.k, 1);
            if (startActionMode != null) {
                AbstractC3226Yv1.b(this.h, startActionMode);
            }
            this.r = startActionMode;
            this.s.p(Boolean.valueOf(t()));
            this.z = true;
            if (t()) {
                return;
            }
            e();
        }
    }

    public void showSelectionMenu(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, String str, int i6, boolean z3, boolean z4, boolean z5, int i7, RenderFrameHost renderFrameHost) {
        this.o.set(i, i2, i3, i4 + i5);
        this.v = z;
        this.A = str;
        this.B = i6;
        boolean z6 = str.length() != 0;
        this.D = z6;
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.z = true;
        if (z6) {
            this.l = renderFrameHost;
            C2493Te3 c2493Te3 = this.H;
            if (c2493Te3 != null && i7 != 7) {
                if (i7 == 9) {
                    c2493Te3.d(this.A, this.B, this.f11539J);
                } else if (i7 == 10) {
                    c2493Te3.c(this.A, this.B, 201, null);
                } else {
                    c2493Te3.e(this.A, this.B, z);
                }
            }
            if (i7 == 9) {
                z();
                return;
            }
            InterfaceC6152i33 interfaceC6152i33 = this.G;
            if (interfaceC6152i33 == null || !interfaceC6152i33.d(z5)) {
                z();
                return;
            }
            return;
        }
        View view = this.q;
        if (view == null || view.getParent() == null || view.getVisibility() != 0) {
            return;
        }
        h();
        C9928t33 c9928t33 = new C9928t33(this);
        Context context = (Context) this.i.j.get();
        if (context == null) {
            return;
        }
        this.E = new C11762yQ0(context, view, c9928t33);
        B();
    }

    public final void i() {
        WebContentsImpl webContentsImpl = this.j;
        if (webContentsImpl.W0() != null) {
            RenderWidgetHostViewImpl W0 = webContentsImpl.W0();
            long j = W0.a;
            if (j == 0) {
                return;
            }
            N.MQWja$xA(j, W0);
        }
    }

    public final void A(int i, int i2) {
        WebContentsImpl webContentsImpl = this.j;
        if (webContentsImpl.W0() != null) {
            RenderWidgetHostViewImpl W0 = webContentsImpl.W0();
            long j = W0.a;
            if (j == 0) {
                throw new IllegalStateException("Native RenderWidgetHostViewAndroid already destroyed", W0.b);
            }
            N.McU85DFE(j, W0, i, i2);
        }
    }

    public final void B() {
        try {
            C11762yQ0 c11762yQ0 = this.E;
            c11762yQ0.e = q();
            ActionMode actionMode = c11762yQ0.d;
            if (actionMode != null) {
                actionMode.invalidateContentRect();
            } else if (actionMode == null) {
                ActionMode startActionMode = c11762yQ0.a.startActionMode(new C11419xQ0(c11762yQ0), 1);
                if (startActionMode != null) {
                    AbstractC3226Yv1.b(c11762yQ0.c, startActionMode);
                    c11762yQ0.d = startActionMode;
                }
            }
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    @Override // defpackage.InterfaceC10236tx2
    public final void b() {
        h();
    }

    public final void h() {
        C11762yQ0 c11762yQ0 = this.E;
        if (c11762yQ0 != null) {
            ActionMode actionMode = c11762yQ0.d;
            if (actionMode != null) {
                actionMode.finish();
                c11762yQ0.d = null;
            }
            this.E = null;
        }
    }

    public final void j() {
        this.u = false;
        this.g.removeCallbacks(this.p);
        if (t()) {
            this.r.finish();
            this.r = null;
            this.s.p(Boolean.valueOf(t()));
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onWindowFocusChanged(boolean z) {
        if (t()) {
            this.r.onWindowFocusChanged(z);
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onAttachedToWindow() {
        C(true);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onDetachedFromWindow() {
        C(false);
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void m(int i) {
        if (t()) {
            hidePopupsAndPreserveSelection();
            z();
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void g(boolean z, boolean z2) {
        C11265wx2 c11265wx2;
        if (z) {
            restoreSelectionPopupsIfNecessary();
            return;
        }
        WebContentsImpl webContentsImpl = this.j;
        ImeAdapterImpl.b(webContentsImpl).u.setEmpty();
        if (this.K) {
            this.K = false;
            hidePopupsAndPreserveSelection();
            return;
        }
        this.z = true;
        j();
        i();
        if (webContentsImpl != null && (c11265wx2 = (C11265wx2) webContentsImpl.v(C11265wx2.class, AbstractC10922vx2.a)) != null) {
            c11265wx2.a();
        }
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:            if (r2.r.getType() == 1) goto L96;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.t()
            if (r0 == 0) goto L10
            android.view.ActionMode r0 = r2.r
            int r0 = r0.getType()
            r1 = 1
            if (r0 != r1) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 != 0) goto L14
            return
        L14:
            boolean r0 = r2.u
            if (r0 != r3) goto L19
            return
        L19:
            r2.u = r3
            s33 r0 = r2.p
            if (r3 == 0) goto L23
            r0.run()
            goto L35
        L23:
            android.os.Handler r3 = r2.g
            r3.removeCallbacks(r0)
            boolean r3 = r2.t()
            if (r3 == 0) goto L35
            android.view.ActionMode r3 = r2.r
            r0 = 300(0x12c, double:1.48E-321)
            r3.hide(r0)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.selection.SelectionPopupControllerImpl.r(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00ee, code lost:            if ((r14 instanceof defpackage.XU) == false) goto L590;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.selection.SelectionPopupControllerImpl.w(android.view.ActionMode, android.view.Menu):void");
    }

    public final boolean v(ActionMode actionMode, MenuItem menuItem) {
        Context context;
        C2493Te3 c2493Te3;
        int i;
        if (!t()) {
            return true;
        }
        int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        if (this.D && (c2493Te3 = this.H) != null) {
            String str = this.A;
            int i2 = this.B;
            if (groupId != 16908353) {
                if (itemId == R.id.select_action_menu_select_all) {
                    i = 200;
                } else if (itemId == R.id.select_action_menu_cut) {
                    i = 103;
                } else if (itemId == R.id.select_action_menu_copy) {
                    i = 101;
                } else if (itemId == R.id.select_action_menu_paste || itemId == R.id.select_action_menu_paste_as_plain_text) {
                    i = 102;
                } else if (itemId == R.id.select_action_menu_share) {
                    i = 104;
                } else if (itemId != 16908353) {
                    i = 108;
                }
                c2493Te3.c(str, i2, i, this.f11539J);
            }
            i = 105;
            c2493Te3.c(str, i2, i, this.f11539J);
        }
        boolean z = false;
        View view = this.q;
        if (groupId == R.id.select_action_menu_assist_items && itemId == 16908353) {
            C5808h33 c5808h33 = this.f11539J;
            if (c5808h33 != null) {
                if ((c5808h33.c != null || c5808h33.d != null) && (c5808h33.e != null || c5808h33.f != null)) {
                    z = true;
                }
                if (z) {
                    View.OnClickListener onClickListener = c5808h33.f;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    } else if (c5808h33.e != null && (context = (Context) this.i.j.get()) != null) {
                        context.startActivity(this.f11539J.e);
                    }
                }
            }
            actionMode.finish();
        } else {
            WebContentsImpl webContentsImpl = this.j;
            if (itemId == R.id.select_action_menu_select_all) {
                webContentsImpl.q();
                N.MNvj1u1S(webContentsImpl.g);
                this.f11539J = null;
                if (this.v) {
                    FI2.a("MobileActionMode.SelectAllWasEditable");
                } else {
                    FI2.a("MobileActionMode.SelectAllWasNonEditable");
                }
            } else if (itemId == R.id.select_action_menu_cut) {
                webContentsImpl.q();
                N.MhIiCaN7(webContentsImpl.g);
                actionMode.finish();
            } else if (itemId == R.id.select_action_menu_copy) {
                webContentsImpl.q();
                N.MpfMxfut(webContentsImpl.g);
                actionMode.finish();
            } else if (itemId == R.id.select_action_menu_paste) {
                webContentsImpl.q();
                N.MYRJ_nNk(webContentsImpl.g);
                actionMode.finish();
            } else if (Build.VERSION.SDK_INT >= 26 && itemId == R.id.select_action_menu_paste_as_plain_text) {
                webContentsImpl.q();
                N.MdSkKRWg(webContentsImpl.g);
                actionMode.finish();
            } else if (itemId == R.id.select_action_menu_share) {
                FI2.a("MobileActionMode.Share");
                String x = x(100000, this.A);
                if (!TextUtils.isEmpty(x)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", x);
                    try {
                        Intent createChooser = Intent.createChooser(intent, this.h.getString(R.string.0_resource_name_obfuscated_res_0x7f1401b5));
                        createChooser.setFlags(268435456);
                        this.h.startActivity(createChooser);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                actionMode.finish();
            } else if (itemId == R.id.select_action_menu_web_search) {
                FI2.a("MobileActionMode.WebSearch");
                String x2 = x(1000, this.A);
                if (!TextUtils.isEmpty(x2)) {
                    Intent intent2 = new Intent("android.intent.action.WEB_SEARCH");
                    intent2.putExtra("new_search", true);
                    intent2.putExtra("query", x2);
                    intent2.putExtra("com.android.browser.application_id", this.h.getPackageName());
                    intent2.addFlags(268435456);
                    try {
                        this.h.startActivity(intent2);
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                actionMode.finish();
            } else if (groupId == R.id.select_action_menu_text_processing_menus) {
                Intent intent3 = menuItem.getIntent();
                FI2.a("MobileActionMode.ProcessTextIntent");
                String x3 = x(100000, this.A);
                if (!TextUtils.isEmpty(x3)) {
                    intent3.putExtra("android.intent.extra.PROCESS_TEXT", x3);
                    try {
                        this.i.B(intent3, new C10271u33(this), null);
                    } catch (ActivityNotFoundException unused3) {
                    }
                }
            } else {
                if (groupId != 16908353) {
                    return false;
                }
                C10634v7 c10634v7 = this.M;
                if (c10634v7 != null) {
                    View.OnClickListener onClickListener2 = (View.OnClickListener) c10634v7.a.get(menuItem);
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    actionMode.finish();
                }
            }
        }
        return true;
    }

    public final Rect q() {
        WebContentsImpl webContentsImpl = this.j;
        float f = webContentsImpl.m.j;
        Rect rect = this.o;
        Rect rect2 = new Rect((int) (rect.left * f), (int) (rect.top * f), (int) (rect.right * f), (int) (rect.bottom * f));
        rect2.offset(0, (int) webContentsImpl.m.k);
        return rect2;
    }

    public final boolean u(int i) {
        boolean z = (this.t & i) != 0;
        if (i != 1) {
            return z;
        }
        if (!z) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        return AbstractC3017Xf2.b(intent, 65536).isEmpty() ^ true;
    }

    public final void C(boolean z) {
        boolean z2 = !z;
        long j = this.m;
        if (j != 0) {
            N.M01adZlM(j, this, z2);
        }
        if (z) {
            restoreSelectionPopupsIfNecessary();
            return;
        }
        this.z = false;
        j();
        if (this.I == null) {
            this.I = (C11265wx2) this.j.v(C11265wx2.class, AbstractC10922vx2.a);
        }
        this.I.a();
    }

    public void onSelectionEvent(int i, int i2, int i3, int i4, int i5) {
        if (i2 == i4) {
            i4++;
        }
        if (i3 == i5) {
            i5++;
        }
        View view = this.q;
        WebContentsImpl webContentsImpl = this.j;
        Rect rect = this.o;
        switch (i) {
            case 0:
                rect.set(i2, i3, i4, i5);
                break;
            case 1:
                rect.set(i2, i3, i4, i5);
                if (t()) {
                    this.r.invalidateContentRect();
                }
                if (this.C && Build.VERSION.SDK_INT >= 29 && view != null) {
                    view.performHapticFeedback(9);
                    break;
                }
                break;
            case 2:
                this.A = "";
                this.B = 0;
                this.D = false;
                this.z = false;
                rect.setEmpty();
                InterfaceC6152i33 interfaceC6152i33 = this.G;
                if (interfaceC6152i33 != null) {
                    interfaceC6152i33.e();
                }
                this.l = null;
                j();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                r(true);
                this.C = true;
                break;
            case 4:
                A(i2, i5);
                C8647pK1 c8647pK1 = this.L;
                if (c8647pK1 != null) {
                    C9675sK1 c9675sK1 = (C9675sK1) c8647pK1.a;
                    Magnifier magnifier = c9675sK1.a;
                    if (magnifier != null) {
                        magnifier.dismiss();
                        c9675sK1.a = null;
                    }
                    c8647pK1.b.cancel();
                    c8647pK1.c = false;
                }
                this.C = false;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                rect.set(i2, i3, i4, i5);
                break;
            case 6:
                rect.set(i2, i3, i4, i5);
                if (!GestureListenerManagerImpl.d(webContentsImpl).isScrollInProgress()) {
                    if (this.E != null) {
                        B();
                        if (this.C && Build.VERSION.SDK_INT >= 29 && view != null) {
                            view.performHapticFeedback(9);
                            break;
                        }
                    }
                }
                h();
                if (this.C) {
                    view.performHapticFeedback(9);
                }
                break;
            case 7:
                if (this.F) {
                    h();
                } else {
                    A(rect.left, rect.bottom);
                }
                this.F = false;
                break;
            case 8:
                h();
                if (!this.D) {
                    rect.setEmpty();
                    break;
                }
                break;
            case 9:
                this.F = this.E != null;
                h();
                this.C = true;
                break;
            case 10:
                if (this.F) {
                    A(rect.left, rect.bottom);
                }
                this.F = false;
                C8647pK1 c8647pK12 = this.L;
                if (c8647pK12 != null) {
                    C9675sK1 c9675sK12 = (C9675sK1) c8647pK12.a;
                    Magnifier magnifier2 = c9675sK12.a;
                    if (magnifier2 != null) {
                        magnifier2.dismiss();
                        c9675sK12.a = null;
                    }
                    c8647pK12.b.cancel();
                    c8647pK12.c = false;
                }
                this.C = false;
                break;
        }
        InterfaceC6152i33 interfaceC6152i332 = this.G;
        if (interfaceC6152i332 != null) {
            float f = webContentsImpl.m.j;
            interfaceC6152i332.a(i, (int) (rect.left * f), (int) (rect.bottom * f));
        }
    }

    public void onDragUpdate(int i, float f, float f2) {
        C8647pK1 c8647pK1;
        View view;
        if ((i != 2 || Build.VERSION.SDK_INT >= 31) && (c8647pK1 = this.L) != null) {
            C6600jN2 c6600jN2 = this.j.m;
            float f3 = c6600jN2.j;
            float f4 = f * f3;
            float f5 = (f2 * f3) + c6600jN2.k;
            C9675sK1 c9675sK1 = (C9675sK1) c8647pK1.a;
            C9242r33 c9242r33 = c9675sK1.b;
            c9242r33.getClass();
            boolean z = N;
            SelectionPopupControllerImpl selectionPopupControllerImpl = c9242r33.a;
            if (z) {
                WindowAndroid windowAndroid = selectionPopupControllerImpl.i;
                view = windowAndroid == null ? null : windowAndroid.t();
            } else {
                view = selectionPopupControllerImpl.q;
            }
            if (view != null) {
                if (c8647pK1.c && f5 != c8647pK1.i) {
                    if (c8647pK1.b.isRunning()) {
                        c8647pK1.b.cancel();
                        c8647pK1.a();
                        c8647pK1.f = c8647pK1.d;
                        c8647pK1.g = c8647pK1.e;
                    } else {
                        c8647pK1.f = c8647pK1.h;
                        c8647pK1.g = c8647pK1.i;
                    }
                    c8647pK1.b.start();
                } else if (!c8647pK1.b.isRunning()) {
                    c9675sK1.a(f4, f5);
                }
                c8647pK1.h = f4;
                c8647pK1.i = f5;
                c8647pK1.c = true;
            }
        }
    }

    public final void e() {
        WebContentsImpl webContentsImpl = this.j;
        if (webContentsImpl != null) {
            if (this.k != AbstractC6846k5.a) {
                if (!webContentsImpl.isDestroyed()) {
                    N.MDK_KK0z(webContentsImpl.g);
                }
                this.f11539J = null;
                this.D = false;
            }
        }
    }

    public final Context getContext() {
        return this.h;
    }

    public void onSelectionChanged(String str) {
        if (TextUtils.isEmpty(str) && this.D) {
            C2493Te3 c2493Te3 = this.H;
            if (c2493Te3 != null) {
                c2493Te3.c(this.A, this.B, 107, null);
            }
            this.z = false;
            j();
        }
        this.A = str;
        InterfaceC6152i33 interfaceC6152i33 = this.G;
        if (interfaceC6152i33 != null) {
            interfaceC6152i33.f(str);
        }
    }

    public final void y(InterfaceC6152i33 interfaceC6152i33) {
        this.G = interfaceC6152i33;
        this.H = interfaceC6152i33 == null ? null : (C2493Te3) interfaceC6152i33.b();
        this.f11539J = null;
    }

    public final void onSelectAroundCaretSuccess(int i, int i2, int i3, int i4) {
        InterfaceC6152i33 interfaceC6152i33 = this.G;
        if (interfaceC6152i33 != null) {
            interfaceC6152i33.c(new C8551p23(i, i2));
        }
    }

    public final void onSelectAroundCaretFailure() {
        InterfaceC6152i33 interfaceC6152i33 = this.G;
        if (interfaceC6152i33 != null) {
            interfaceC6152i33.c(null);
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        C11265wx2 c11265wx2;
        WebContentsImpl webContentsImpl = this.j;
        if (windowAndroid != null) {
            this.i = windowAndroid;
            this.h = webContentsImpl.t();
            s();
            h();
            return;
        }
        this.z = true;
        j();
        i();
        if (webContentsImpl != null && (c11265wx2 = (C11265wx2) webContentsImpl.v(C11265wx2.class, AbstractC10922vx2.a)) != null) {
            c11265wx2.a();
        }
        e();
        this.h = null;
        this.i = null;
    }

    public void hidePopupsAndPreserveSelection() {
        this.z = false;
        j();
        if (this.I == null) {
            this.I = (C11265wx2) this.j.v(C11265wx2.class, AbstractC10922vx2.a);
        }
        this.I.a();
    }

    @Override // defpackage.InterfaceC8775pi1
    public final void o(boolean z, boolean z2) {
        if (!z) {
            h();
        }
        if (z == this.v && z2 == this.w) {
            return;
        }
        this.v = z;
        this.w = z2;
        if (t()) {
            this.r.invalidate();
        }
    }

    public void restoreSelectionPopupsIfNecessary() {
        if (!this.D || t()) {
            return;
        }
        z();
    }

    public final void nativeSelectionPopupControllerDestroyed() {
        this.m = 0L;
    }
}
