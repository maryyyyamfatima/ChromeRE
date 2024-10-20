package org.chromium.chrome.browser.toolbar.top;

import J.N;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.LevelListDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC1895Op0;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC8142nr1;
import defpackage.AbstractC8540p04;
import defpackage.C10021tL;
import defpackage.C10055tR3;
import defpackage.C10226tv3;
import defpackage.C12180ze1;
import defpackage.C3814bG;
import defpackage.C6621jR3;
import defpackage.C7309lR3;
import defpackage.C7653mR3;
import defpackage.C7928nE;
import defpackage.C7997nR3;
import defpackage.C8267oD;
import defpackage.C8341oR3;
import defpackage.C8385oa2;
import defpackage.C8610pD;
import defpackage.C8684pR3;
import defpackage.C9027qR3;
import defpackage.C9369rR3;
import defpackage.C9712sR3;
import defpackage.Ec4;
import defpackage.FI2;
import defpackage.G12;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC11299x32;
import defpackage.InterfaceC4216cR3;
import defpackage.InterfaceC5925hP3;
import defpackage.KH;
import defpackage.KP3;
import defpackage.LS1;
import defpackage.O83;
import defpackage.P12;
import defpackage.RJ3;
import defpackage.S12;
import defpackage.SF1;
import defpackage.UN;
import defpackage.VQ;
import defpackage.WH0;
import defpackage.Y50;
import defpackage.ZN3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.HomeButton;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ToolbarTablet extends d implements View.OnClickListener, View.OnLongClickListener {
    public static final /* synthetic */ int U = 0;
    public ImageButton A;
    public ImageButton B;
    public ToggleTabStackButton C;
    public View.OnClickListener D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ImageButton[] H;
    public ImageButton I;

    /* renamed from: J */
    public boolean f11532J;
    public ImageView K;
    public S12 L;
    public Boolean M;
    public org.chromium.chrome.browser.omnibox.a N;
    public final int O;
    public final int P;
    public boolean Q;
    public AnimatorSet R;
    public KH S;
    public KH T;
    public ObjectAnimator v;
    public HomeButton w;
    public ImageButton x;
    public ImageButton y;
    public ImageButton z;

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void r(boolean z) {
        int i = 0;
        boolean z2 = true;
        if ((!z || !O83.a.e("accessibility_tab_switcher", true)) && !UN.A.a()) {
            z2 = false;
        }
        this.F = z2;
        ToggleTabStackButton toggleTabStackButton = this.C;
        if (!z2 && !z2) {
            i = 8;
        }
        toggleTabStackButton.setVisibility(i);
    }

    public ToolbarTablet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807bb);
        this.P = getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080800);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.w = (HomeButton) findViewById(R.id.home_button);
        this.x = (ImageButton) findViewById(R.id.back_button);
        this.y = (ImageButton) findViewById(R.id.forward_button);
        this.z = (ImageButton) findViewById(R.id.refresh_button);
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        int integer = getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0090);
        int integer2 = getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0091);
        levelListDrawable.addLevel(integer, integer, AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f0900da, R.color.0_resource_name_obfuscated_res_0x7f07012b, getContext()));
        levelListDrawable.addLevel(integer2, integer2, AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f0900c5, R.color.0_resource_name_obfuscated_res_0x7f07012b, getContext()));
        this.z.setImageDrawable(levelListDrawable);
        this.F = (C10021tL.f().c() && O83.a.e("accessibility_tab_switcher", true)) || UN.A.a();
        ToggleTabStackButton toggleTabStackButton = (ToggleTabStackButton) findViewById(R.id.tab_switcher_button);
        this.C = toggleTabStackButton;
        boolean z = this.F;
        toggleTabStackButton.setVisibility((z || z) ? 0 : 8);
        this.A = (ImageButton) findViewById(R.id.bookmark_button);
        this.B = (ImageButton) findViewById(R.id.save_offline_button);
        this.Q = false;
        this.G = true;
        this.H = new ImageButton[]{this.x, this.y, this.z};
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void M(org.chromium.chrome.browser.omnibox.a aVar) {
        this.N = aVar;
        ((org.chromium.chrome.browser.omnibox.c) this.N.g).a.getBackground().setTint(AbstractC11746yN.c(getContext(), R.dimen.0_resource_name_obfuscated_res_0x7f080172));
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void v() {
        super.v();
        this.w.setOnClickListener(this);
        this.w.setOnKeyListener(new C7653mR3(this));
        this.x.setOnClickListener(this);
        this.x.setLongClickable(true);
        this.x.setOnKeyListener(new C7997nR3(this));
        this.y.setOnClickListener(this);
        this.y.setLongClickable(true);
        this.y.setOnKeyListener(new C8341oR3(this));
        this.z.setOnClickListener(this);
        this.z.setOnLongClickListener(this);
        this.z.setOnKeyListener(new C8684pR3(this));
        this.A.setOnClickListener(this);
        this.A.setOnLongClickListener(this);
        LS1 ls1 = this.s;
        C9027qR3 c9027qR3 = new C9027qR3(this);
        MenuButton menuButton = ls1.e;
        if (menuButton != null) {
            menuButton.setOnKeyListener(c9027qR3);
        }
        this.B.setOnClickListener(this);
        this.B.setOnLongClickListener(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        ImageButton imageButton = this.x;
        if (imageButton == view) {
            c0(imageButton, false);
            return true;
        }
        ImageButton imageButton2 = this.y;
        if (imageButton2 == view) {
            c0(imageButton2, true);
            return true;
        }
        return super.showContextMenuForChild(view);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = (ImageView) getRootView().findViewById(R.id.toolbar_hairline);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        S12 s12;
        if (z && (s12 = this.L) != null) {
            s12.h.dismiss();
            this.L = null;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.w == view) {
            E();
            return;
        }
        if (this.x != view) {
            if (this.y != view) {
                if (this.z != view) {
                    ImageButton imageButton = this.A;
                    if (imageButton == view) {
                        View.OnClickListener onClickListener = this.D;
                        if (onClickListener != null) {
                            onClickListener.onClick(imageButton);
                            FI2.a("MobileToolbarToggleBookmark");
                            return;
                        }
                        return;
                    }
                    if (this.B == view) {
                        KH kh = this.T;
                        Context context = getContext();
                        Tab a = this.j.a();
                        kh.getClass();
                        DownloadUtils.c(context, a);
                        FI2.a("MobileToolbarDownloadPage");
                        return;
                    }
                    return;
                }
                q();
                InterfaceC4216cR3 interfaceC4216cR3 = this.k;
                if (interfaceC4216cR3 != null) {
                    C6621jR3 c6621jR3 = (C6621jR3) interfaceC4216cR3;
                    Tab tab = (Tab) c6621jR3.a.get();
                    if (tab == null) {
                        return;
                    }
                    if (tab.e()) {
                        tab.B();
                        FI2.a("MobileToolbarStop");
                    } else {
                        tab.c();
                        FI2.a("MobileToolbarReload");
                    }
                    c6621jR3.k.run();
                    return;
                }
                return;
            }
            q();
            InterfaceC4216cR3 interfaceC4216cR32 = this.k;
            if (interfaceC4216cR32 != null) {
                C6621jR3 c6621jR32 = (C6621jR3) interfaceC4216cR32;
                Tab tab2 = (Tab) c6621jR32.a.get();
                if (tab2 != null && tab2.j()) {
                    tab2.i();
                    c6621jR32.k.run();
                }
            }
            FI2.a("MobileToolbarForward");
            return;
        }
        q();
        InterfaceC4216cR3 interfaceC4216cR33 = this.k;
        if (interfaceC4216cR33 != null && ((C6621jR3) interfaceC4216cR33).a()) {
            FI2.a("MobileToolbarBack");
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String string;
        Context context = getContext();
        Resources resources = context.getResources();
        ImageButton imageButton = this.z;
        if (view == imageButton) {
            if (imageButton.getDrawable().getLevel() == resources.getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0090)) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140949);
            } else {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140645);
            }
        } else if (view == this.A) {
            string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14061b);
        } else {
            string = view == this.B ? resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140620) : null;
        }
        return ZN3.e(context, view, string);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void B() {
        boolean o = o();
        Boolean bool = this.M;
        if (bool == null || bool.booleanValue() != o) {
            this.l.g(AbstractC11746yN.a(getContext(), o), o());
            this.M = Boolean.valueOf(o);
        }
        InterfaceC11299x32 j = this.j.j();
        j.g(new C7309lR3(j));
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void A() {
        InterfaceC11299x32 j = this.j.j();
        j.g(new C7309lR3(j));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kR3] */
    public final void c0(ImageButton imageButton, boolean z) {
        Tab a = this.j.a();
        if (a == null || a.b() == null) {
            return;
        }
        Profile b = Profile.b(a.b());
        Context context = getContext();
        NavigationController i = a.b().i();
        int i2 = z ? 2 : 1;
        final InterfaceC5925hP3 interfaceC5925hP3 = this.j;
        Objects.requireNonNull(interfaceC5925hP3);
        final S12 s12 = new S12(b, context, i, i2, new InterfaceC0079Ap3() { // from class: kR3
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return InterfaceC5925hP3.this.a();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, this.S);
        this.L = s12;
        if (!s12.s) {
            Object obj = ThreadUtils.a;
            s12.s = true;
            s12.r = new WH0();
            HashSet hashSet = new HashSet();
            int i3 = 0;
            while (true) {
                G12 g12 = s12.j;
                if (i3 >= g12.b()) {
                    break;
                }
                NavigationEntry a2 = g12.a(i3);
                if (a2.g == null) {
                    final GURL gurl = a2.b;
                    if (!hashSet.contains(gurl)) {
                        FaviconHelper$FaviconImageCallback faviconHelper$FaviconImageCallback = new FaviconHelper$FaviconImageCallback() { // from class: N12
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException
                                */
                            @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
                            public final void onFaviconAvailable(android.graphics.Bitmap r6, org.chromium.url.GURL r7) {
                                /*
                                    r5 = this;
                                    S12 r7 = defpackage.S12.this
                                    android.content.Context r0 = r7.g
                                    r1 = 1
                                    org.chromium.url.GURL r2 = r2
                                    if (r6 != 0) goto L1e
                                    VH0 r6 = r7.q
                                    if (r6 != 0) goto L14
                                    VH0 r6 = new VH0
                                    r6.<init>()
                                    r7.q = r6
                                L14:
                                    VH0 r6 = r7.q
                                    android.content.res.Resources r3 = r0.getResources()
                                    android.graphics.Bitmap r6 = r6.b(r3, r2, r1)
                                L1e:
                                    boolean r3 = defpackage.T34.k(r2)
                                    r4 = 0
                                    if (r3 == 0) goto L4c
                                    org.chromium.chrome.browser.profiles.Profile r3 = r7.a
                                    boolean r3 = r3.i()
                                    if (r3 == 0) goto L39
                                    nE r3 = defpackage.UN.a
                                    java.lang.String r3 = "UpdateHistoryEntryPointsInIncognito"
                                    boolean r3 = J.N.M09VlOh_(r3)
                                    if (r3 == 0) goto L39
                                    r3 = r1
                                    goto L3a
                                L39:
                                    r3 = r4
                                L3a:
                                    if (r3 == 0) goto L4c
                                    VH0 r6 = r7.q
                                    android.content.res.Resources r0 = r0.getResources()
                                    r6.getClass()
                                    r6 = 2131297107(0x7f090353, float:1.821215E38)
                                    android.graphics.Bitmap r6 = defpackage.VH0.a(r0, r6, r1)
                                L4c:
                                    G12 r0 = r7.j
                                    int r1 = r0.b()
                                    if (r4 >= r1) goto L65
                                    org.chromium.content_public.browser.NavigationEntry r0 = r0.a(r4)
                                    org.chromium.url.GURL r1 = r0.b
                                    boolean r1 = r2.equals(r1)
                                    if (r1 == 0) goto L62
                                    r0.g = r6
                                L62:
                                    int r4 = r4 + 1
                                    goto L4c
                                L65:
                                    R12 r6 = r7.k
                                    r6.notifyDataSetChanged()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.N12.onFaviconAvailable(android.graphics.Bitmap, org.chromium.url.GURL):void");
                            }
                        };
                        WH0 wh0 = s12.r;
                        wh0.getClass();
                        wh0.a(s12.a, gurl.i(), s12.m, faviconHelper$FaviconImageCallback);
                        hashSet.add(gurl);
                    }
                }
                i3++;
            }
        }
        ListPopupWindow listPopupWindow = s12.h;
        if (!listPopupWindow.isShowing()) {
            FI2.a(s12.a("Popup"));
        }
        View anchorView = listPopupWindow.getAnchorView();
        P12 p12 = s12.n;
        if (anchorView != null && p12 != null) {
            listPopupWindow.getAnchorView().removeOnLayoutChangeListener(p12);
        }
        listPopupWindow.setAnchorView(imageButton);
        if (s12.l == 0) {
            imageButton.addOnLayoutChangeListener(p12);
            int width = (listPopupWindow.getAnchorView().getWidth() - listPopupWindow.getWidth()) / 2;
            if (width > 0) {
                listPopupWindow.setHorizontalOffset(width);
            }
            listPopupWindow.show();
            return;
        }
        listPopupWindow.show();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, defpackage.QJ3
    public final void c(int i, ColorStateList colorStateList) {
        this.w.setImageTintList(colorStateList);
        this.x.setImageTintList(colorStateList);
        this.y.setImageTintList(colorStateList);
        this.B.setImageTintList(colorStateList);
        this.z.setImageTintList(colorStateList);
        ToggleTabStackButton toggleTabStackButton = this.C;
        toggleTabStackButton.s.c(AbstractC3494aK3.c(toggleTabStackButton.getContext(), i));
        ImageButton imageButton = this.I;
        if (imageButton == null || !this.f11532J) {
            return;
        }
        imageButton.setImageTintList(colorStateList);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, defpackage.PJ3
    public final void b(int i, boolean z) {
        setBackgroundColor(i);
        ((org.chromium.chrome.browser.omnibox.c) this.N.g).a.getBackground().setTint(AbstractC3494aK3.b(i, getContext(), o()));
        this.N.q();
        S(i);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void X() {
        this.N.o.i0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void V(boolean z) {
        boolean z2 = z && !this.E;
        this.x.setEnabled(z2);
        this.x.setFocusable(z2);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void Z(boolean z) {
        boolean z2 = z && !this.E;
        this.y.setEnabled(z2);
        this.y.setFocusable(z2);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void b0(boolean z) {
        if (z) {
            this.z.getDrawable().setLevel(getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0091));
            this.z.setContentDescription(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140120));
        } else {
            this.z.getDrawable().setLevel(getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0090));
            this.z.setContentDescription(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14011f));
        }
        this.z.setEnabled(!this.E);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void W(boolean z, boolean z2) {
        if (z) {
            this.A.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0900d4);
            this.A.setImageTintList(Y50.b(getContext(), o() ? R.color.0_resource_name_obfuscated_res_0x7f070116 : R.color.0_resource_name_obfuscated_res_0x7f070113));
            this.A.setContentDescription(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140464));
        } else {
            this.A.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0900d3);
            ImageButton imageButton = this.A;
            RJ3 rj3 = this.r;
            imageButton.setImageTintList(rj3 == null ? this.i : rj3.h);
            this.A.setContentDescription(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14013f));
        }
        this.A.setEnabled(z2);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void Q(boolean z, boolean z2, boolean z3, LS1 ls1) {
        this.E = this.F && z;
        C7928nE c7928nE = UN.a;
        if (N.M6bsIDpc("GridTabSwitcherForTablets", "enable_launch_polish", false)) {
            int i = z ? 4 : 0;
            this.N.t(!this.E);
            if (getImportantForAccessibility() != i) {
                setImportantForAccessibility(i);
                sendAccessibilityEvent(2048);
                return;
            }
            return;
        }
        if (!UN.A.a()) {
            if (this.E) {
                this.x.setEnabled(false);
                this.y.setEnabled(false);
                this.z.setEnabled(false);
                this.N.a.setVisibility(4);
                ls1.c(true);
                return;
            }
            this.N.a.setVisibility(0);
            ls1.c(false);
            return;
        }
        boolean z4 = this.E;
        float f = z4 ? 1.0f : 0.0f;
        float f2 = z4 ? 0.0f : 1.0f;
        ObjectAnimator objectAnimator = this.v;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (this.E) {
            this.N.t(false);
            int i2 = this.E ? 4 : 0;
            ImageView imageView = this.K;
            if (imageView != null && imageView.getVisibility() != i2) {
                this.K.setVisibility(i2);
            }
        }
        setVisibility(0);
        setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ToolbarTablet, Float>) View.ALPHA, f, f2);
        this.v = ofFloat;
        ofFloat.setDuration(200L);
        this.v.setInterpolator(AbstractC8142nr1.f);
        this.v.addListener(new C9369rR3(this));
        this.v.start();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void n(LocationBarModel locationBarModel, C6621jR3 c6621jR3, LS1 ls1, C8385oa2 c8385oa2, KH kh, KP3 kp3, KH kh2) {
        super.n(locationBarModel, c6621jR3, ls1, c8385oa2, kh, kp3, kh2);
        this.S = kh;
        this.T = kh2;
        ls1.d(true);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void e() {
        super.e();
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.R.cancel();
            this.R = null;
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void P(C10226tv3 c10226tv3) {
        ToggleTabStackButton toggleTabStackButton = this.C;
        toggleTabStackButton.t = c10226tv3;
        c10226tv3.a(toggleTabStackButton);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void F(VQ vq) {
        this.D = vq;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void N(View.OnClickListener onClickListener) {
        this.C.u = onClickListener;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void t(boolean z) {
        this.w.setVisibility(z ? 0 : 8);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final SF1 h() {
        return this.N;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.Q = true;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AnimatorSet animatorSet;
        boolean z = View.MeasureSpec.getSize(i) >= ((int) ((((float) 600) * AbstractC1895Op0.b(getContext()).d) + 0.5f));
        if (this.G != z) {
            this.G = z;
            if (!this.Q) {
                for (ImageButton imageButton : this.H) {
                    imageButton.setVisibility(z ? 0 : 8);
                }
                g gVar = this.N.o;
                gVar.K = z;
                gVar.i0();
                d0(z);
            } else {
                AnimatorSet animatorSet2 = this.R;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i3 = this.P;
                int i4 = this.O;
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (ImageButton imageButton2 : this.H) {
                        arrayList.add(this.N.o.B(imageButton2));
                    }
                    arrayList.addAll(this.N.n(this.w.getVisibility() != 0 ? i4 - i3 : 0));
                    animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.addListener(new C9712sR3(this));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (ImageButton imageButton3 : this.H) {
                        arrayList2.add(this.N.o.A(imageButton3));
                    }
                    arrayList2.addAll(this.N.a(this.w.getVisibility() != 0 ? i4 - i3 : 0));
                    animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList2);
                    animatorSet.addListener(new C10055tR3(this));
                }
                this.R = animatorSet;
                animatorSet.start();
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void a0(C8610pD c8610pD) {
        if (this.I == null) {
            this.I = (ImageButton) ((ViewStub) findViewById(R.id.optional_button_stub)).inflate();
        }
        C8267oD c8267oD = c8610pD.c;
        boolean z = c8267oD.e;
        this.f11532J = z;
        if (!z) {
            this.I.setImageTintList(null);
        } else {
            ImageButton imageButton = this.I;
            RJ3 rj3 = this.r;
            imageButton.setImageTintList(rj3 == null ? this.i : rj3.h);
        }
        C12180ze1 c12180ze1 = c8267oD.f;
        if (c12180ze1 != null) {
            c12180ze1.h = this.I;
        }
        this.I.setOnClickListener(c8267oD.b);
        View.OnLongClickListener onLongClickListener = c8267oD.c;
        if (onLongClickListener == null) {
            this.I.setLongClickable(false);
        } else {
            this.I.setLongClickable(true);
            this.I.setOnLongClickListener(onLongClickListener);
        }
        this.I.setImageDrawable(c8267oD.a);
        this.I.setContentDescription(getContext().getResources().getString(c8267oD.d));
        this.I.setVisibility(0);
        this.I.setEnabled(c8610pD.b);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final C3814bG p() {
        return new C3814bG(0, 0, 0, !this.o);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void m() {
        ImageButton imageButton = this.I;
        if (imageButton == null || imageButton.getVisibility() == 8) {
            return;
        }
        this.I.setVisibility(8);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final HomeButton g() {
        return this.w;
    }

    public final void d0(boolean z) {
        int i = z || this.w.getVisibility() == 0 ? this.O : this.P;
        int paddingTop = getPaddingTop();
        WeakHashMap weakHashMap = Ec4.a;
        setPaddingRelative(i, paddingTop, getPaddingEnd(), getPaddingBottom());
    }
}
