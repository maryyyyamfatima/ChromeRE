package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UZ1 extends LZ1 implements InterfaceC11179wj {
    public final int u;
    public final InterfaceC7697ma2 v;
    public int w;
    public TZ1 x;
    public Tab y;
    public final SZ1 z;

    @Override // defpackage.LZ1
    public final boolean l() {
        return false;
    }

    public static void v(int i) {
        Q83 q83 = O83.a;
        q83.m(AbstractC6265iP.k.b(String.valueOf(i)));
        q83.m(AbstractC6265iP.i.b(String.valueOf(i)));
        q83.m(AbstractC6265iP.h.b(String.valueOf(i)));
        q83.m(AbstractC6265iP.f.b(String.valueOf(i)));
        q83.m(AbstractC6265iP.g.b(String.valueOf(i)));
        C7851n02 c7851n02 = C7851n02.i;
        q83.m(AbstractC6265iP.j.b(String.valueOf(i)));
    }

    public static void x(int i, InterfaceC10590uz3 interfaceC10590uz3) {
        Q83 q83 = O83.a;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        int count = abstractC11276wz3.j(false).getCount();
        q83.q(count, AbstractC6265iP.h.b(String.valueOf(i)));
        q83.q(abstractC11276wz3.j(true).getCount(), AbstractC6265iP.f.b(String.valueOf(i)));
        if (count == 0) {
            q83.t(AbstractC6265iP.k.b(String.valueOf(i)), "");
            q83.t(AbstractC6265iP.i.b(String.valueOf(i)), "");
        }
    }

    public UZ1(Activity activity, C8385oa2 c8385oa2, C7507m02 c7507m02, I5 i5, C8385oa2 c8385oa22, InterfaceC9377rT1 interfaceC9377rT1) {
        super(activity, c8385oa2, c7507m02, i5, interfaceC9377rT1);
        this.w = -1;
        this.z = new SZ1(this);
        this.u = C7851n02.g();
        this.v = c8385oa22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [MZ1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [NZ1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [OZ1] */
    @Override // defpackage.LZ1, defpackage.InterfaceC9035qT1
    public final boolean a(int i, boolean z) {
        if (i != R.id.manage_all_windows_menu_id) {
            return super.a(i, z);
        }
        ArrayList s = s();
        Activity activity = this.h;
        ZX1 zx1 = (ZX1) ((C8385oa2) this.v).g;
        LargeIconBridge largeIconBridge = new LargeIconBridge(t());
        ?? r6 = new Callback() { // from class: MZ1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C1756Nn1 c1756Nn1 = (C1756Nn1) obj;
                UZ1 uz1 = UZ1.this;
                uz1.getClass();
                int i2 = c1756Nn1.a;
                FI2.a("Android.WindowManager.SelectWindow");
                Activity activity2 = uz1.h;
                int i3 = c1756Nn1.b;
                if (i3 == -1) {
                    LZ1.s = 0;
                    activity2.startActivity(C7851n02.c(i2, activity2, false, true), C7851n02.i(uz1.j.a));
                } else {
                    ((ActivityManager) activity2.getSystemService("activity")).moveTaskToFront(i3, 0);
                }
            }
        };
        ?? r7 = new Callback() { // from class: NZ1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                UZ1 uz1 = UZ1.this;
                uz1.getClass();
                int i2 = ((C1756Nn1) obj).a;
                UZ1.v(i2);
                InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) ED3.a().i.get(i2);
                if (interfaceC10590uz3 != null) {
                    ((AbstractC11276wz3) interfaceC10590uz3).d(true);
                }
                ((AbstractC9561rz3) ((C8385oa2) uz1.i).g).a(i2);
                Activity r = UZ1.r(i2);
                if (r != null) {
                    r.finishAndRemoveTask();
                }
            }
        };
        ?? r8 = new Runnable() { // from class: OZ1
            @Override // java.lang.Runnable
            public final void run() {
                UZ1.this.q("Android.WindowManager.NewWindow");
            }
        };
        int i2 = 1;
        boolean z2 = s.size() < C7851n02.g();
        final C3656ao1 c3656ao1 = new C3656ao1(activity, zx1, largeIconBridge, r6, r7, r8);
        C3656ao1 c3656ao12 = C3656ao1.n;
        if (c3656ao12 != null) {
            c3656ao12.e.c(5, c3656ao12.j);
        }
        C3469aF3 c3469aF3 = C3469aF3.j;
        if (c3469aF3 != null) {
            c3469aF3.f.c(5, c3469aF3.g);
        }
        C3656ao1.n = c3656ao1;
        int i3 = 0;
        while (true) {
            int size = s.size();
            C7616mK1 c7616mK1 = c3656ao1.f;
            FD2[] fd2Arr = AbstractC4000bo1.i;
            Context context = c3656ao1.a;
            if (i3 >= size) {
                c3656ao1.l = new PropertyModel(fd2Arr);
                c3656ao1.a(z2);
                c7616mK1.s(new C7272lK1(1, c3656ao1.l));
                C3316Zn1 c3316Zn1 = new C3316Zn1(c3656ao1);
                Resources resources = context.getResources();
                String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14053e);
                BD2 bd2 = new BD2(AbstractC4249cY1.B);
                bd2.e(AbstractC4249cY1.a, c3316Zn1);
                bd2.b(AbstractC4249cY1.r, true);
                bd2.e(AbstractC4249cY1.h, c3656ao1.h);
                bd2.e(AbstractC4249cY1.c, string);
                bd2.e(AbstractC4249cY1.j, null);
                bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
                bd2.b(AbstractC4249cY1.x, true);
                PropertyModel a = bd2.a();
                c3656ao1.j = a;
                c3656ao1.e.l(a, 1, false);
                FI2.a("MobileMenuWindowManager");
                LU3.a(t()).notifyEvent("instance_switcher_iph_used");
                return true;
            }
            final C1756Nn1 c1756Nn1 = (C1756Nn1) s.get(i3);
            C8197o04 c8197o04 = c3656ao1.g;
            String b = c8197o04.b(c1756Nn1);
            String a2 = c8197o04.a(c1756Nn1);
            boolean z3 = c1756Nn1.c == i2 ? i2 : 0;
            HashMap e = PropertyModel.e(fd2Arr);
            PD2 pd2 = AbstractC4000bo1.d;
            GD2 gd2 = new GD2();
            gd2.a = b;
            e.put(pd2, gd2);
            PD2 pd22 = AbstractC4000bo1.e;
            GD2 gd22 = new GD2();
            gd22.a = a2;
            e.put(pd22, gd22);
            LD2 ld2 = AbstractC4000bo1.a;
            AD2 ad2 = new AD2();
            ad2.a = z3;
            e.put(ld2, ad2);
            ND2 nd2 = AbstractC4000bo1.f;
            DD2 dd2 = new DD2();
            dd2.a = c1756Nn1.a;
            e.put(nd2, dd2);
            PD2 pd23 = AbstractC4000bo1.g;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Tn1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3656ao1 c3656ao13 = C3656ao1.this;
                    c3656ao13.getClass();
                    C1756Nn1 c1756Nn12 = c1756Nn1;
                    int i4 = c1756Nn12.c;
                    if (i4 == 1 || i4 == 2) {
                        ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140537, 1, c3656ao13.a).d();
                        return;
                    }
                    c3656ao13.e.c(3, c3656ao13.j);
                    c3656ao13.b.onResult(c1756Nn12);
                }
            };
            GD2 gd23 = new GD2();
            gd23.a = onClickListener;
            e.put(pd23, gd23);
            if (z3 == 0) {
                C7616mK1 c7616mK12 = new C7616mK1();
                c7616mK12.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14053b, 0, 0));
                final C4738dx c4738dx = new C4738dx(context, c7616mK12, new SC1() { // from class: Un1
                    @Override // defpackage.SC1
                    public final void b(PropertyModel propertyModel) {
                        String quantityString;
                        final C3656ao1 c3656ao13 = C3656ao1.this;
                        c3656ao13.getClass();
                        if (propertyModel.h(AbstractC4144cD1.a) == R.string.0_resource_name_obfuscated_res_0x7f14053b) {
                            C1756Nn1 c1756Nn12 = c1756Nn1;
                            if ((C8197o04.d(c1756Nn12) == 0 && c1756Nn12.c == 3) ? true : O83.a.e("Chrome.MultiWindow.CloseWindowSkipConfirm", false)) {
                                c3656ao13.b(c1756Nn12);
                                return;
                            }
                            c3656ao13.k = c1756Nn12;
                            Context context2 = c3656ao13.a;
                            final Dialog dialog = new Dialog(context2, R.style.f103650_resource_name_obfuscated_res_0x7f1504aa);
                            dialog.setCanceledOnTouchOutside(false);
                            dialog.setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e008c);
                            Resources resources2 = context2.getResources();
                            ImageView imageView = (ImageView) dialog.findViewById(R.id.title_icon);
                            imageView.setImageDrawable(c3656ao13.i);
                            imageView.setOnClickListener(new View.OnClickListener() { // from class: Xn1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    dialog.dismiss();
                                }
                            });
                            ((TextView) dialog.findViewById(R.id.title)).setText(resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f14053a));
                            TextView textView = (TextView) dialog.findViewById(R.id.message);
                            C8197o04 c8197o042 = c3656ao13.g;
                            c8197o042.getClass();
                            int d = C8197o04.d(c1756Nn12);
                            int i4 = c1756Nn12.b == -1 ? 0 : c1756Nn12.g;
                            Resources resources3 = c8197o042.a.getResources();
                            if (c1756Nn12.h && i4 > 0) {
                                int i5 = c1756Nn12.f;
                                if (i5 == 0) {
                                    quantityString = resources3.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120019, i4, Integer.valueOf(i4));
                                } else {
                                    quantityString = resources3.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12001a, i5, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i4));
                                }
                            } else if (d == 0) {
                                quantityString = resources3.getString(R.string.0_resource_name_obfuscated_res_0x7f140539);
                            } else {
                                String str = c1756Nn12.e;
                                if (d == 1) {
                                    quantityString = resources3.getString(R.string.0_resource_name_obfuscated_res_0x7f140538, str);
                                } else {
                                    int i6 = d - 1;
                                    quantityString = resources3.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12001b, i6, str, Integer.valueOf(i6), str);
                                }
                            }
                            textView.setText(quantityString);
                            TextView textView2 = (TextView) dialog.findViewById(R.id.positive_button);
                            textView2.setText(resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f140362));
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: Yn1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C3656ao1 c3656ao14 = C3656ao1.this;
                                    c3656ao14.getClass();
                                    Dialog dialog2 = dialog;
                                    if (((CheckBox) dialog2.findViewById(R.id.no_more_check)).isChecked()) {
                                        O83.a.p("Chrome.MultiWindow.CloseWindowSkipConfirm", true);
                                    }
                                    dialog2.dismiss();
                                    c3656ao14.b(c3656ao14.k);
                                }
                            });
                            TextView textView3 = (TextView) dialog.findViewById(R.id.negative_button);
                            textView3.setText(resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4));
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: Pn1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C3656ao1 c3656ao14 = C3656ao1.this;
                                    c3656ao14.getClass();
                                    dialog.dismiss();
                                    c3656ao14.e.c(2, c3656ao14.j);
                                }
                            });
                            dialog.show();
                        }
                    }
                });
                c4738dx.a(new Runnable() { // from class: Vn1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FI2.a("Android.WindowManager.SecondaryMenu");
                    }
                });
                PD2 pd24 = AbstractC4000bo1.h;
                ZC1 zc1 = new ZC1() { // from class: Wn1
                    @Override // defpackage.ZC1
                    public final /* synthetic */ LI2 a(View view) {
                        return YC1.a(view);
                    }

                    @Override // defpackage.ZC1
                    public final TC1 b() {
                        return C4738dx.this;
                    }
                };
                GD2 gd24 = new GD2();
                gd24.a = zc1;
                e.put(pd24, gd24);
            }
            PropertyModel propertyModel = new PropertyModel(e);
            c8197o04.c(propertyModel, AbstractC4000bo1.c, c1756Nn1);
            c7616mK1.s(new C7272lK1(0, propertyModel));
            i3++;
            i2 = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [PZ1] */
    @Override // defpackage.LZ1
    public final void p(final Tab tab) {
        ZX1 zx1 = (ZX1) ((C8385oa2) this.v).g;
        LargeIconBridge largeIconBridge = new LargeIconBridge(t());
        ?? r2 = new Callback() { // from class: PZ1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C1756Nn1 c1756Nn1 = (C1756Nn1) obj;
                UZ1 uz1 = UZ1.this;
                uz1.getClass();
                Activity r = UZ1.r(c1756Nn1.a);
                Tab tab2 = tab;
                Activity activity = uz1.h;
                if (r != null) {
                    ChromeTabbedActivity chromeTabbedActivity = (ChromeTabbedActivity) r;
                    Intent intent = new Intent();
                    intent.setClassName(V60.a, ChromeTabbedActivity.class.getName());
                    C7851n02.v(intent, activity, chromeTabbedActivity.getClass());
                    LZ1.s = 0;
                    FI2.a("MobileMenuMoveToOtherWindow");
                    C10720vN2.a(tab2).b(intent, null);
                    chromeTabbedActivity.onNewIntent(intent);
                    ((ActivityManager) activity.getSystemService("activity")).moveTaskToFront(chromeTabbedActivity.getTaskId(), 0);
                    return;
                }
                LZ1.s = 0;
                Intent c = C7851n02.c(c1756Nn1.a, activity, false, true);
                C10720vN2 a = C10720vN2.a(tab2);
                Bundle i = C7851n02.i(uz1.j.a);
                a.b(c, null);
                activity.startActivity(c, i);
            }
        };
        ArrayList s = s();
        final C3469aF3 c3469aF3 = new C3469aF3(this.h, zx1, largeIconBridge, r2);
        C3656ao1 c3656ao1 = C3656ao1.n;
        if (c3656ao1 != null) {
            c3656ao1.e.c(5, c3656ao1.j);
        }
        C3469aF3 c3469aF32 = C3469aF3.j;
        if (c3469aF32 != null) {
            c3469aF32.f.c(5, c3469aF32.g);
        }
        C3469aF3.j = c3469aF3;
        Iterator it = s.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                final C1756Nn1 c1756Nn1 = (C1756Nn1) it.next();
                int i = c1756Nn1.c;
                int i2 = c1756Nn1.a;
                if (i == 1) {
                    c3469aF3.h = c1756Nn1;
                    c3469aF3.i = i2;
                }
                C8197o04 c8197o04 = c3469aF3.d;
                String b = c8197o04.b(c1756Nn1);
                String a = c8197o04.a(c1756Nn1);
                HashMap e = PropertyModel.e(AbstractC3813bF3.g);
                PD2 pd2 = AbstractC3813bF3.b;
                GD2 gd2 = new GD2();
                gd2.a = b;
                e.put(pd2, gd2);
                PD2 pd22 = AbstractC3813bF3.c;
                GD2 gd22 = new GD2();
                gd22.a = a;
                e.put(pd22, gd22);
                ND2 nd2 = AbstractC3813bF3.d;
                DD2 dd2 = new DD2();
                dd2.a = i2;
                e.put(nd2, dd2);
                LD2 ld2 = AbstractC3813bF3.f;
                if (c1756Nn1.c != 1) {
                    z = false;
                }
                AD2 ad2 = new AD2();
                ad2.a = z;
                e.put(ld2, ad2);
                PD2 pd23 = AbstractC3813bF3.e;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: WE3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3469aF3 c3469aF33 = C3469aF3.this;
                        c3469aF33.getClass();
                        C1756Nn1 c1756Nn12 = c1756Nn1;
                        int i3 = c1756Nn12.a;
                        if (c3469aF33.h.a == i3) {
                            return;
                        }
                        c3469aF33.g.k(AbstractC4249cY1.m, c3469aF33.i == i3);
                        Iterator it2 = c3469aF33.c.iterator();
                        while (it2.hasNext()) {
                            C7272lK1 c7272lK1 = (C7272lK1) it2.next();
                            int h = c7272lK1.b.h(AbstractC3813bF3.d);
                            int i4 = c3469aF33.h.a;
                            LD2 ld22 = AbstractC3813bF3.f;
                            PropertyModel propertyModel = c7272lK1.b;
                            if (h == i4) {
                                propertyModel.k(ld22, false);
                            } else if (h == i3) {
                                propertyModel.k(ld22, true);
                            }
                        }
                        c3469aF33.h = c1756Nn12;
                    }
                };
                GD2 gd23 = new GD2();
                gd23.a = onClickListener;
                PropertyModel a2 = AbstractC5266fV2.a(e, pd23, gd23, e);
                c8197o04.c(a2, AbstractC3813bF3.a, c1756Nn1);
                c3469aF3.c.s(new C7272lK1(0, a2));
            } else {
                ZE3 ze3 = new ZE3(c3469aF3);
                Context context = c3469aF3.a;
                Resources resources = context.getResources();
                String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140631);
                BD2 bd2 = new BD2(AbstractC4249cY1.B);
                bd2.e(AbstractC4249cY1.a, ze3);
                bd2.b(AbstractC4249cY1.r, true);
                bd2.e(AbstractC4249cY1.h, c3469aF3.e);
                bd2.e(AbstractC4249cY1.c, string);
                bd2.b(AbstractC4249cY1.m, true);
                bd2.c(AbstractC4249cY1.v, 1);
                bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f140b23);
                bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
                bd2.b(AbstractC4249cY1.x, true);
                PropertyModel a3 = bd2.a();
                c3469aF3.g = a3;
                c3469aF3.f.l(a3, 1, false);
                return;
            }
        }
    }

    @Override // defpackage.LZ1
    public final void q(String str) {
        Activity activity = this.h;
        Intent intent = new Intent(activity, (Class<?>) ChromeTabbedActivity.class);
        LZ1.s = 0;
        C7851n02.v(intent, activity, ChromeTabbedActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(134217728);
        intent.putExtra("com.android.chrome.prefer_new", true);
        AbstractC2281Ro1.a(intent);
        C7507m02 c7507m02 = this.j;
        c7507m02.getClass();
        C7851n02 c7851n02 = C7851n02.i;
        c7851n02.getClass();
        boolean b = C7851n02.b();
        Activity activity2 = c7507m02.a;
        if (!b) {
            c7851n02.getClass();
            if (!C7851n02.p(activity2)) {
                c7851n02.getClass();
                if (!C7851n02.n(activity2)) {
                    activity.startActivity(intent);
                    FI2.a(str);
                }
            }
        }
        intent.addFlags(4096);
        activity.startActivity(intent, C7851n02.i(activity2));
        FI2.a(str);
    }

    public final ArrayList s() {
        int i;
        int i2;
        int i3;
        w();
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray k = C7851n02.k();
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (i6 < this.u) {
            if (u(i6)) {
                Activity r = r(i6);
                if (r != null) {
                    if (r == this.h) {
                        i2 = arrayList.size();
                        i3 = 1;
                        Q83 q83 = O83.a;
                        arrayList.add(new C1756Nn1(i6, q83.f(i4, AbstractC6265iP.e.b(String.valueOf(i6))), i3, q83.i(AbstractC6265iP.k.b(String.valueOf(i6)), null), q83.i(AbstractC6265iP.i.b(String.valueOf(i6)), null), q83.f(0, AbstractC6265iP.h.b(String.valueOf(i6))), q83.f(0, AbstractC6265iP.f.b(String.valueOf(i6))), q83.e(AbstractC6265iP.g.b(String.valueOf(i6)), false)));
                        i5 = i2;
                    } else if (k.get(r.getTaskId())) {
                        i = 2;
                        i2 = i5;
                        i3 = i;
                        Q83 q832 = O83.a;
                        arrayList.add(new C1756Nn1(i6, q832.f(i4, AbstractC6265iP.e.b(String.valueOf(i6))), i3, q832.i(AbstractC6265iP.k.b(String.valueOf(i6)), null), q832.i(AbstractC6265iP.i.b(String.valueOf(i6)), null), q832.f(0, AbstractC6265iP.h.b(String.valueOf(i6))), q832.f(0, AbstractC6265iP.f.b(String.valueOf(i6))), q832.e(AbstractC6265iP.g.b(String.valueOf(i6)), false)));
                        i5 = i2;
                    }
                }
                i = 3;
                i2 = i5;
                i3 = i;
                Q83 q8322 = O83.a;
                arrayList.add(new C1756Nn1(i6, q8322.f(i4, AbstractC6265iP.e.b(String.valueOf(i6))), i3, q8322.i(AbstractC6265iP.k.b(String.valueOf(i6)), null), q8322.i(AbstractC6265iP.i.b(String.valueOf(i6)), null), q8322.f(0, AbstractC6265iP.h.b(String.valueOf(i6))), q8322.f(0, AbstractC6265iP.f.b(String.valueOf(i6))), q8322.e(AbstractC6265iP.g.b(String.valueOf(i6)), false)));
                i5 = i2;
            }
            i6++;
            i4 = -1;
        }
        if (i5 != 0 && arrayList.size() > 1) {
            arrayList.add(0, (C1756Nn1) arrayList.remove(i5));
        }
        return arrayList;
    }

    @Override // defpackage.LZ1
    public final int h(int i, int i2, boolean z) {
        w();
        int i3 = this.u;
        if (i >= 0 && i < i3) {
            return i;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= i3) {
                i5 = -1;
                break;
            }
            if (i2 == O83.a.f(-1, AbstractC6265iP.e.b(String.valueOf(i5)))) {
                break;
            }
            i5++;
        }
        if (i5 != -1) {
            return i5;
        }
        if (z) {
            while (i4 < i3) {
                if (!u(i4)) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int i6 = -1;
        while (i4 < i3) {
            if (O83.a.f(-1, AbstractC6265iP.e.b(String.valueOf(i4))) == -1 && (i6 == -1 || C7851n02.u(i4) > C7851n02.u(i6))) {
                i6 = i4;
            }
            i4++;
        }
        return i6;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [QZ1] */
    @Override // defpackage.LZ1
    public final void k(int i, int i2) {
        this.w = i;
        Q83 q83 = O83.a;
        q83.q(i2, AbstractC6265iP.e.b(String.valueOf(i)));
        AbstractC11276wz3 abstractC11276wz3 = ((AbstractC9561rz3) ((C8385oa2) this.i).g).b;
        this.x = new TZ1(this, abstractC11276wz3, abstractC11276wz3);
        int i3 = this.w;
        C7851n02 c7851n02 = C7851n02.i;
        q83.s(System.currentTimeMillis(), AbstractC6265iP.j.b(String.valueOf(i3)));
        int f = C7851n02.f();
        int i4 = this.u + 1;
        EI2.h(f, i4, "Android.MultiInstance.NumInstances");
        Iterator it = ApplicationStatus.b().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (((Activity) it.next()) instanceof ChromeTabbedActivity) {
                i5++;
            }
        }
        EI2.h(i5, i4, "Android.MultiInstance.NumActivities");
        Activity activity = this.h;
        final ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
        if (activityManager != null) {
            ?? r0 = new InterfaceC0079Ap3() { // from class: QZ1
                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return activityManager.getAppTasks();
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }
            };
            KH kh = new KH();
            if (VZ1.j == null) {
                VZ1.j = new VZ1(r0, kh);
            }
            VZ1 vz1 = VZ1.j;
            vz1.h.a(new RZ1(this));
        }
        ApplicationStatus.e(this, activity);
    }

    public final void w() {
        ActivityManager.RecentTaskInfo d;
        HashSet hashSet = new HashSet();
        for (ActivityManager.AppTask appTask : ((ActivityManager) this.h.getSystemService("activity")).getAppTasks()) {
            if (TextUtils.equals(C7851n02.d(appTask), ChromeTabbedActivity.class.getName()) && (d = AbstractC2599Ua.d(appTask)) != null) {
                hashSet.add(Integer.valueOf(d.id));
            }
        }
        Q83 q83 = O83.a;
        C10218tu1 c10218tu1 = AbstractC6265iP.e;
        q83.a.getClass();
        Map<String, ?> all = T60.a.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(c10218tu1.a)) {
                hashMap.put(key, entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashSet.contains(entry2.getValue())) {
                O83.a.m((String) entry2.getKey());
            }
        }
        for (int i = 0; i < this.u; i++) {
            if (u(i)) {
                Q83 q832 = O83.a;
                if (!((q832.f(0, AbstractC6265iP.h.b(String.valueOf(i))) == 0 && q832.f(-1, AbstractC6265iP.e.b(String.valueOf(i))) == -1) ? false : true)) {
                    v(i);
                }
            }
        }
    }

    public static Activity r(int i) {
        DD3 a = ED3.a();
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (i == a.a(activity)) {
                return activity;
            }
        }
        return null;
    }

    public static boolean u(int i) {
        return C7851n02.u(i) != 0;
    }

    public final Profile t() {
        return ((AbstractC9561rz3) ((C8385oa2) this.i).get()).b.g().b();
    }

    @Override // defpackage.LZ1, defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        TZ1 tz1 = this.x;
        if (tz1 != null) {
            tz1.a();
        }
        w();
        if (this.w != -1) {
            ApplicationStatus.h(this);
        }
        super.onDestroy();
    }

    @Override // defpackage.LZ1, defpackage.InterfaceC3657ao2
    public final void c() {
        super.c();
        int i = this.w;
        C7851n02 c7851n02 = C7851n02.i;
        O83.a.s(System.currentTimeMillis(), AbstractC6265iP.j.b(String.valueOf(i)));
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (C7851n02.r()) {
            if (i == 3 || i == 5) {
                Q83 q83 = O83.a;
                long g = q83.g(0L, "Chrome.MultiInstance.MaxCountTime");
                int i2 = 0;
                int f = q83.f(0, "Chrome.MultiInstance.MaxInstanceCount");
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - g > 86400000) {
                    if (g != 0) {
                        EI2.h(f, this.u + 1, "Android.MultiInstance.MaxInstanceCount");
                    }
                    q83.s(currentTimeMillis, "Chrome.MultiInstance.MaxCountTime");
                } else {
                    i2 = f;
                }
                int f2 = C7851n02.f();
                if (f2 > i2) {
                    q83.q(f2, "Chrome.MultiInstance.MaxInstanceCount");
                }
            }
        }
    }
}
