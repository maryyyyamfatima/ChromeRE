package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$UnfollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9366rR0 {
    public final C7616mK1 a;
    public final C5932hR0 b;
    public final Context c;
    public final Xl4 d;

    public C9366rR0(Context context, C7616mK1 c7616mK1, C5932hR0 c5932hR0, Xl4 xl4) {
        this.a = c7616mK1;
        this.b = c5932hR0;
        this.c = context;
        this.d = xl4;
        c7616mK1.s(new C7272lK1(2, new PropertyModel(new FD2[0])));
        N.MKcAcTO8(new Callback() { // from class: lR0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [mR0] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ((Boolean) obj).booleanValue();
                final C9366rR0 c9366rR0 = C9366rR0.this;
                c9366rR0.getClass();
                final ?? r0 = new Callback() { // from class: mR0
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        List list = (List) obj2;
                        final C9366rR0 c9366rR02 = C9366rR0.this;
                        Context context2 = c9366rR02.c;
                        String string = context2.getResources().getString(R.string.f73960_resource_name_obfuscated_res_0x7f1404b8);
                        String string2 = context2.getResources().getString(R.string.f73970_resource_name_obfuscated_res_0x7f1404b9);
                        C7616mK1 c7616mK12 = c9366rR02.a;
                        c7616mK12.clear();
                        Iterator it = list.iterator();
                        while (true) {
                            boolean z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata = (WebFeedBridge$WebFeedMetadata) it.next();
                            Objects.toString(webFeedBridge$WebFeedMetadata.c);
                            int i = webFeedBridge$WebFeedMetadata.e;
                            String str = i == 4 ? string2 : i == 1 ? string : "";
                            int i2 = webFeedBridge$WebFeedMetadata.d;
                            if (i2 != 1 && i2 != 3) {
                                z = false;
                            }
                            String i3 = webFeedBridge$WebFeedMetadata.c.i();
                            HashMap e = PropertyModel.e(AbstractC6618jR0.i);
                            PD2 pd2 = AbstractC6618jR0.g;
                            GD2 gd2 = new GD2();
                            gd2.a = webFeedBridge$WebFeedMetadata.a;
                            e.put(pd2, gd2);
                            PD2 pd22 = AbstractC6618jR0.a;
                            GD2 gd22 = new GD2();
                            gd22.a = webFeedBridge$WebFeedMetadata.b;
                            e.put(pd22, gd22);
                            PD2 pd23 = AbstractC6618jR0.b;
                            GD2 gd23 = new GD2();
                            gd23.a = i3;
                            e.put(pd23, gd23);
                            PD2 pd24 = AbstractC6618jR0.c;
                            GD2 gd24 = new GD2();
                            gd24.a = str;
                            e.put(pd24, gd24);
                            PD2 pd25 = AbstractC6618jR0.e;
                            Boolean valueOf = Boolean.valueOf(z);
                            GD2 gd25 = new GD2();
                            gd25.a = valueOf;
                            e.put(pd25, gd25);
                            PD2 pd26 = AbstractC6618jR0.f;
                            Boolean bool = Boolean.TRUE;
                            GD2 gd26 = new GD2();
                            gd26.a = bool;
                            e.put(pd26, gd26);
                            final PropertyModel propertyModel = new PropertyModel(e);
                            propertyModel.o(AbstractC6618jR0.d, new Runnable() { // from class: oR0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final C9366rR0 c9366rR03 = C9366rR0.this;
                                    c9366rR03.getClass();
                                    PD2 pd27 = AbstractC6618jR0.g;
                                    final PropertyModel propertyModel2 = propertyModel;
                                    byte[] bArr = (byte[]) propertyModel2.i(pd27);
                                    PD2 pd28 = AbstractC6618jR0.e;
                                    boolean booleanValue = ((Boolean) propertyModel2.i(pd28)).booleanValue();
                                    if (!booleanValue) {
                                        N.MxULk9PS(0, 31);
                                        N.MtL148iF(bArr, false, 3, new Callback() { // from class: pR0
                                            @Override // org.chromium.base.Callback
                                            public final ZE e0(Object obj3) {
                                                return new ZE(this, obj3);
                                            }

                                            @Override // org.chromium.base.Callback
                                            public final void onResult(Object obj3) {
                                                WebFeedBridge$FollowResults webFeedBridge$FollowResults = (WebFeedBridge$FollowResults) obj3;
                                                C9366rR0 c9366rR04 = C9366rR0.this;
                                                c9366rR04.getClass();
                                                c9366rR04.a(webFeedBridge$FollowResults.a);
                                                PD2 pd29 = AbstractC6618jR0.e;
                                                Boolean valueOf2 = Boolean.valueOf(webFeedBridge$FollowResults.a == 1);
                                                PropertyModel propertyModel3 = propertyModel2;
                                                propertyModel3.o(pd29, valueOf2);
                                                propertyModel3.o(AbstractC6618jR0.f, Boolean.TRUE);
                                            }
                                        });
                                    } else {
                                        N.MxULk9PS(0, 32);
                                        N.MVWVyQhp(bArr, false, 3, new Callback() { // from class: qR0
                                            @Override // org.chromium.base.Callback
                                            public final ZE e0(Object obj3) {
                                                return new ZE(this, obj3);
                                            }

                                            @Override // org.chromium.base.Callback
                                            public final void onResult(Object obj3) {
                                                WebFeedBridge$UnfollowResults webFeedBridge$UnfollowResults = (WebFeedBridge$UnfollowResults) obj3;
                                                C9366rR0 c9366rR04 = C9366rR0.this;
                                                c9366rR04.getClass();
                                                c9366rR04.a(webFeedBridge$UnfollowResults.a);
                                                PD2 pd29 = AbstractC6618jR0.e;
                                                Boolean valueOf2 = Boolean.valueOf(webFeedBridge$UnfollowResults.a != 1);
                                                PropertyModel propertyModel3 = propertyModel2;
                                                propertyModel3.o(pd29, valueOf2);
                                                propertyModel3.o(AbstractC6618jR0.f, Boolean.TRUE);
                                            }
                                        });
                                    }
                                    propertyModel2.o(AbstractC6618jR0.f, Boolean.FALSE);
                                    propertyModel2.o(pd28, Boolean.valueOf(!booleanValue));
                                }
                            });
                            final C7272lK1 c7272lK1 = new C7272lK1(0, propertyModel);
                            c7616mK12.s(c7272lK1);
                            c9366rR02.d.a(context2.getResources().getDimensionPixelSize(R.dimen.f42930_resource_name_obfuscated_res_0x7f080843), context2.getResources().getDimensionPixelSize(R.dimen.f42940_resource_name_obfuscated_res_0x7f080844), webFeedBridge$WebFeedMetadata.c, webFeedBridge$WebFeedMetadata.g, new Callback() { // from class: nR0
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj3) {
                                    return new ZE(this, obj3);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj3) {
                                    C7272lK1.this.b.o(AbstractC6618jR0.h, (Bitmap) obj3);
                                }
                            });
                        }
                        if (list.isEmpty()) {
                            c7616mK12.s(new C7272lK1(1, new PropertyModel(new FD2[0])));
                        }
                    }
                };
                N.M0KK$hz_(new Callback() { // from class: Ll4
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (Object[]) obj2) {
                            arrayList.add((WebFeedBridge$WebFeedMetadata) obj3);
                        }
                        r0.onResult(arrayList);
                    }
                });
            }
        });
    }

    public final void a(int i) {
        C5932hR0 c5932hR0 = this.b;
        if (i == 2) {
            ZN3.b(R.string.f73730_resource_name_obfuscated_res_0x7f1404a1, 1, c5932hR0.a.a).d();
        } else if (i != 1) {
            ZN3.b(R.string.f73740_resource_name_obfuscated_res_0x7f1404a2, 1, c5932hR0.a.a).d();
        }
    }
}
