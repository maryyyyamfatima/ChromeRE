package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.webapps.launchpad.AppManagementMenuPermissionsView;
import org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ai */
/* loaded from: classes2.dex */
public final class C3618ai {
    public final Context a;
    public final C3024Xh b;
    public final C7616mK1 c;
    public final List d;

    public C3618ai(Context context, C3024Xh c3024Xh, C7616mK1 c7616mK1, ArrayList arrayList) {
        this.a = context;
        this.b = c3024Xh;
        this.c = c7616mK1;
        this.d = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C1806Nx1 c1806Nx1 = (C1806Nx1) it.next();
            PropertyModel propertyModel = new PropertyModel(HM3.m);
            propertyModel.o(HM3.a, c1806Nx1.b);
            propertyModel.m(HM3.b, 1);
            propertyModel.o(HM3.h, c1806Nx1.b);
            propertyModel.o(HM3.c, new BitmapDrawable(c1806Nx1.e));
            propertyModel.o(HM3.j, new View.OnClickListener() { // from class: Yh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Context context2 = C3618ai.this.a;
                    C1806Nx1 c1806Nx12 = c1806Nx1;
                    try {
                        context2.startActivity(AbstractC7759mk4.a(c1806Nx12.a, c1806Nx12.d, false));
                    } catch (ActivityNotFoundException unused) {
                        ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f14072c, 0, context2).d();
                    }
                }
            });
            propertyModel.o(HM3.k, new View.OnLongClickListener() { // from class: Zh
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    final C6367ii c6367ii = C3618ai.this.b.b;
                    c6367ii.getClass();
                    HashMap e = PropertyModel.e(AbstractC4249cY1.B);
                    JD2 jd2 = AbstractC4249cY1.a;
                    GD2 gd2 = new GD2();
                    gd2.a = c6367ii;
                    e.put(jd2, gd2);
                    LD2 ld2 = AbstractC4249cY1.r;
                    AD2 ad2 = new AD2();
                    ad2.a = true;
                    e.put(ld2, ad2);
                    PD2 pd2 = AbstractC4249cY1.h;
                    Context context2 = c6367ii.a;
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0163, (ViewGroup) null, false);
                    View findViewById = inflate.findViewById(R.id.dialog_header);
                    HashMap e2 = PropertyModel.e(AbstractC6710ji.d);
                    PD2 pd22 = AbstractC6710ji.a;
                    final C1806Nx1 c1806Nx12 = c1806Nx1;
                    String str = c1806Nx12.c;
                    GD2 gd22 = new GD2();
                    gd22.a = str;
                    e2.put(pd22, gd22);
                    PD2 pd23 = AbstractC6710ji.b;
                    GD2 gd23 = new GD2();
                    gd23.a = c1806Nx12.d;
                    e2.put(pd23, gd23);
                    PD2 pd24 = AbstractC6710ji.c;
                    GD2 gd24 = new GD2();
                    gd24.a = c1806Nx12.e;
                    UD2.a(AbstractC5266fV2.a(e2, pd24, gd24, e2), findViewById, new C7054ki());
                    c6367ii.k = new C7742mi(context2, (AppManagementMenuPermissionsView) inflate.findViewById(R.id.permissions), c1806Nx12);
                    c6367ii.j = (ListView) inflate.findViewById(R.id.shortcuts_list_view);
                    C7616mK1 c7616mK12 = new C7616mK1();
                    List<Wj4> list = c1806Nx12.f;
                    if (list != null) {
                        for (final Wj4 wj4 : list) {
                            HashMap e3 = PropertyModel.e(B93.f);
                            PD2 pd25 = B93.a;
                            String str2 = wj4.a;
                            GD2 gd25 = new GD2();
                            gd25.a = str2;
                            e3.put(pd25, gd25);
                            PD2 pd26 = B93.b;
                            GD2 gd26 = new GD2();
                            gd26.a = wj4.c;
                            e3.put(pd26, gd26);
                            PD2 pd27 = B93.c;
                            Bitmap a = wj4.f.a();
                            GD2 gd27 = new GD2();
                            gd27.a = a;
                            e3.put(pd27, gd27);
                            PD2 pd28 = B93.e;
                            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: hi
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C6367ii c6367ii2 = C6367ii.this;
                                    c6367ii2.getClass();
                                    String str3 = c1806Nx12.a;
                                    String str4 = wj4.c;
                                    Context context3 = c6367ii2.a;
                                    try {
                                        context3.startActivity(AbstractC7759mk4.a(str3, str4, false));
                                    } catch (ActivityNotFoundException unused) {
                                        ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f14072c, 0, context3).d();
                                    }
                                    ((ZX1) c6367ii2.g.get()).c(3, c6367ii2.i);
                                }
                            };
                            GD2 gd28 = new GD2();
                            gd28.a = onClickListener;
                            c7616mK12.s(new C7272lK1(0, AbstractC5266fV2.a(e3, pd28, gd28, e3)));
                        }
                    }
                    c7616mK12.s(c6367ii.b(R.string.0_resource_name_obfuscated_res_0x7f1405ad, new View.OnClickListener() { // from class: ei
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C6367ii c6367ii2 = C6367ii.this;
                            c6367ii2.getClass();
                            String str3 = c1806Nx12.a;
                            Context context3 = c6367ii2.a;
                            if (!AbstractC4983eg2.d(context3, str3)) {
                                AbstractC4851eH1.a("LaunchpadManageMenu", AbstractC4809e90.a("WebApk not found:", str3), new Object[0]);
                                return;
                            }
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.setData(Uri.parse("package:" + str3));
                            context3.startActivity(intent);
                            ((ZX1) c6367ii2.g.get()).c(3, c6367ii2.i);
                        }
                    }));
                    c7616mK12.s(c6367ii.b(R.string.0_resource_name_obfuscated_res_0x7f1405ac, new View.OnClickListener() { // from class: fi
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C6367ii c6367ii2 = C6367ii.this;
                            c6367ii2.getClass();
                            Bundle R0 = SingleWebsiteSettings.R0(c1806Nx12.d);
                            c6367ii2.h.b(c6367ii2.a, SingleWebsiteSettings.class, R0);
                        }
                    }));
                    C7342lY1 c7342lY1 = new C7342lY1(c7616mK12);
                    c6367ii.j.setAdapter((ListAdapter) c7342lY1);
                    c7342lY1.a(0, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e0165), new TD2() { // from class: gi
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj, Object obj2) {
                            C93.a((PropertyModel) wd2, (View) obj, (FD2) obj2);
                        }
                    });
                    c7342lY1.a(1, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e0165), new TD2() { // from class: gi
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj, Object obj2) {
                            C93.a((PropertyModel) wd2, (View) obj, (FD2) obj2);
                        }
                    });
                    GD2 gd29 = new GD2();
                    gd29.a = inflate;
                    c6367ii.i = AbstractC5266fV2.a(e, pd2, gd29, e);
                    ((ZX1) c6367ii.g.get()).l(c6367ii.i, 1, false);
                    return true;
                }
            });
            this.c.s(new C7272lK1(0, propertyModel));
        }
    }
}
