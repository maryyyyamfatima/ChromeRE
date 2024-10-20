package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class V32 implements Callback {
    public final /* synthetic */ Y32 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        List list = (List) obj;
        final Y32 y32 = this.a;
        y32.getClass();
        if (list.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        Callback callback = new Callback() { // from class: W32
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Tutorial tutorial = (Tutorial) obj2;
                final Y32 y322 = Y32.this;
                y322.getClass();
                final List list2 = arrayList;
                if (tutorial != null) {
                    list2.add(tutorial);
                }
                y322.b.d(new Callback() { // from class: X32
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj3) {
                        return new ZE(this, obj3);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj3) {
                        Y32 y323 = Y32.this;
                        y323.getClass();
                        if (((Boolean) obj3).booleanValue()) {
                            for (final Tutorial tutorial2 : list2) {
                                int i = tutorial2.a;
                                String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : "IPH_VideoTutorial_NTP_VoiceSearch" : "IPH_VideoTutorial_NTP_Search" : "IPH_VideoTutorial_NTP_Download" : "IPH_VideoTutorial_NTP_ChromeIntro" : "IPH_VideoTutorial_NTP_Summary";
                                if (str != null) {
                                    KU3 ku3 = y323.b;
                                    if (ku3.shouldTriggerHelpUI(str)) {
                                        AbstractC9764sb4.b(tutorial2.a, 8);
                                        final Y94 y94 = y323.c;
                                        PropertyModel propertyModel = y94.b;
                                        propertyModel.k(Z94.a, true);
                                        propertyModel.o(Z94.b, tutorial2.b);
                                        PD2 pd2 = Z94.c;
                                        int i2 = tutorial2.i;
                                        propertyModel.o(pd2, AbstractC11822yb4.a(i2));
                                        propertyModel.k(Z94.d, i2 != 0);
                                        propertyModel.o(Z94.f, new Runnable() { // from class: T94
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Y94.this.d.onResult(tutorial2);
                                            }
                                        });
                                        propertyModel.o(Z94.g, new Runnable() { // from class: U94
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Y94.this.e.onResult(tutorial2);
                                            }
                                        });
                                        propertyModel.o(Z94.e, new InterfaceC3980bl() { // from class: V94
                                            @Override // defpackage.InterfaceC3980bl
                                            public final Runnable a(int i3, int i4, final C3636al c3636al) {
                                                final Y94 y942 = Y94.this;
                                                y942.getClass();
                                                Tutorial tutorial3 = tutorial2;
                                                boolean z = tutorial3.a == 1;
                                                String str2 = z ? "use_animated_gif_url_for_summary_card" : "use_animated_gif_url";
                                                C7928nE c7928nE = UN.a;
                                                boolean M6bsIDpc = N.M6bsIDpc("VideoTutorials", str2, !z);
                                                C0037Ah1 a = C0037Ah1.a(i3, M6bsIDpc ? tutorial3.e : tutorial3.f, i4, "VideoTutorialsIPH");
                                                ImageFetcher imageFetcher = y942.c;
                                                if (M6bsIDpc) {
                                                    imageFetcher.c(a, new Callback() { // from class: W94
                                                        @Override // org.chromium.base.Callback
                                                        public final ZE e0(Object obj4) {
                                                            return new ZE(this, obj4);
                                                        }

                                                        @Override // org.chromium.base.Callback
                                                        public final void onResult(Object obj4) {
                                                            C5070ev c5070ev = (C5070ev) obj4;
                                                            c3636al.onResult(c5070ev == null ? null : new RunnableC4383cv(c5070ev, Bitmap.Config.ARGB_8888));
                                                        }
                                                    });
                                                } else {
                                                    imageFetcher.d(a, new Callback() { // from class: X94
                                                        @Override // org.chromium.base.Callback
                                                        public final ZE e0(Object obj4) {
                                                            return new ZE(this, obj4);
                                                        }

                                                        @Override // org.chromium.base.Callback
                                                        public final void onResult(Object obj4) {
                                                            Y94 y943 = Y94.this;
                                                            y943.getClass();
                                                            c3636al.onResult(new BitmapDrawable(y943.a.getResources(), (Bitmap) obj4));
                                                        }
                                                    });
                                                }
                                                return new RunnableC12082zL2();
                                            }
                                        });
                                        ku3.dismissed(str);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                });
            }
        };
        VideoTutorialServiceBridge videoTutorialServiceBridge = y32.d;
        long j = videoTutorialServiceBridge.a;
        if (j == 0) {
            return;
        }
        N.MSP6HvY8(j, videoTutorialServiceBridge, 1, callback);
    }
}
