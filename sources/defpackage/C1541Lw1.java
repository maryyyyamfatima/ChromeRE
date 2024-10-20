package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1541Lw1 {
    public final VideoTutorialServiceBridge a;
    public final C5228fO b;
    public final PropertyModel c;
    public final C7616mK1 d;
    public String e;
    public int f;

    public C1541Lw1(PropertyModel propertyModel, C7616mK1 c7616mK1, VideoTutorialServiceBridge videoTutorialServiceBridge, C5228fO c5228fO) {
        this.a = videoTutorialServiceBridge;
        this.b = c5228fO;
        this.c = propertyModel;
        this.d = c7616mK1;
        long j = videoTutorialServiceBridge.a;
        this.e = j == 0 ? null : N.MKTDYLaI(j, videoTutorialServiceBridge);
    }

    public final void a(List list) {
        C6796jw1 c6796jw1;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            this.b.getClass();
            C10230tw1 c10230tw1 = (C10230tw1) C9549rx1.b().a.get(str);
            if (c10230tw1 == null) {
                c6796jw1 = null;
            } else {
                c6796jw1 = new C6796jw1(c10230tw1.a, c10230tw1.b, c10230tw1.c);
            }
            if (c6796jw1 != null) {
                HashMap e = PropertyModel.e(AbstractC12288zw1.f);
                PD2 pd2 = AbstractC12288zw1.a;
                GD2 gd2 = new GD2();
                String str2 = c6796jw1.a;
                gd2.a = str2;
                e.put(pd2, gd2);
                PD2 pd22 = AbstractC12288zw1.b;
                GD2 gd22 = new GD2();
                gd22.a = c6796jw1.b;
                e.put(pd22, gd22);
                PD2 pd23 = AbstractC12288zw1.c;
                GD2 gd23 = new GD2();
                gd23.a = c6796jw1.c;
                e.put(pd23, gd23);
                LD2 ld2 = AbstractC12288zw1.d;
                boolean equals = TextUtils.equals(str2, this.e);
                AD2 ad2 = new AD2();
                ad2.a = equals;
                e.put(ld2, ad2);
                PD2 pd24 = AbstractC12288zw1.e;
                Callback callback = new Callback() { // from class: Kw1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C1541Lw1 c1541Lw1 = C1541Lw1.this;
                        c1541Lw1.e = (String) obj;
                        c1541Lw1.a(c1541Lw1.a.a(c1541Lw1.f));
                    }
                };
                GD2 gd24 = new GD2();
                gd24.a = callback;
                PropertyModel a = AbstractC5266fV2.a(e, pd24, gd24, e);
                arrayList.add(new C7272lK1(1, a));
                z |= a.j(ld2);
            }
        }
        this.d.A(arrayList);
        this.c.k(InterfaceC1671Mw1.c, z);
    }
}
