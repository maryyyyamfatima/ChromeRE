package defpackage;

import J.N;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hw1 */
/* loaded from: classes2.dex */
public final class C1022Hw1 {
    public final C1541Lw1 a;

    public C1022Hw1(View view, VideoTutorialServiceBridge videoTutorialServiceBridge, C5228fO c5228fO) {
        view.getContext();
        PropertyModel propertyModel = new PropertyModel(InterfaceC1671Mw1.d);
        C7616mK1 c7616mK1 = new C7616mK1();
        UD2.a(propertyModel, view, new TD2() { // from class: Nw1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                final PropertyModel propertyModel2 = (PropertyModel) wd2;
                View view2 = (View) obj;
                FD2 fd2 = (FD2) obj2;
                if (fd2 == InterfaceC1671Mw1.b) {
                    view2.findViewById(R.id.watch).setOnClickListener(new View.OnClickListener() { // from class: Qw1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ((Runnable) PropertyModel.this.i(InterfaceC1671Mw1.b)).run();
                        }
                    });
                    return;
                }
                if (fd2 == InterfaceC1671Mw1.a) {
                    view2.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: Rw1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ((Runnable) PropertyModel.this.i(InterfaceC1671Mw1.a)).run();
                        }
                    });
                    return;
                }
                LD2 ld2 = InterfaceC1671Mw1.c;
                if (fd2 == ld2) {
                    view2.findViewById(R.id.watch).setEnabled(propertyModel2.j(ld2));
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        view.getContext();
        recyclerView.q0(new LinearLayoutManager(1, false));
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        c4617dc3.Q(1, new InterfaceC7960nK1() { // from class: Ow1
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e015c, viewGroup, false);
            }
        }, new TD2() { // from class: Pw1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                final PropertyModel propertyModel2 = (PropertyModel) wd2;
                FD2 fd2 = (FD2) obj2;
                final RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) ((View) obj).findViewById(R.id.language_radio_button);
                PD2 pd2 = AbstractC12288zw1.b;
                if (fd2 == pd2) {
                    radioButtonWithDescription.h.setText((CharSequence) propertyModel2.i(pd2));
                    return;
                }
                PD2 pd22 = AbstractC12288zw1.c;
                if (fd2 == pd22) {
                    radioButtonWithDescription.h((CharSequence) propertyModel2.i(pd22));
                    return;
                }
                LD2 ld2 = AbstractC12288zw1.d;
                if (fd2 == ld2) {
                    radioButtonWithDescription.f(propertyModel2.j(ld2));
                } else if (fd2 == AbstractC12288zw1.e) {
                    radioButtonWithDescription.j = new PG2() { // from class: Aw1
                        @Override // defpackage.PG2
                        public final void a(RadioButtonWithDescription radioButtonWithDescription2) {
                            if (RadioButtonWithDescription.this.e()) {
                                PD2 pd23 = AbstractC12288zw1.e;
                                PropertyModel propertyModel3 = propertyModel2;
                                ((Callback) propertyModel3.i(pd23)).onResult((String) propertyModel3.i(AbstractC12288zw1.a));
                            }
                        }
                    };
                }
            }
        });
        recyclerView.n0(c4617dc3);
        this.a = new C1541Lw1(propertyModel, c7616mK1, videoTutorialServiceBridge, c5228fO);
    }

    public final void a(int i, final Runnable runnable, final Runnable runnable2) {
        final C1541Lw1 c1541Lw1 = this.a;
        c1541Lw1.f = i;
        PD2 pd2 = InterfaceC1671Mw1.a;
        Runnable runnable3 = new Runnable() { // from class: Iw1
            @Override // java.lang.Runnable
            public final void run() {
                C1541Lw1 c1541Lw12 = C1541Lw1.this;
                VideoTutorialServiceBridge videoTutorialServiceBridge = c1541Lw12.a;
                long j = videoTutorialServiceBridge.a;
                c1541Lw12.e = j == 0 ? null : N.MKTDYLaI(j, videoTutorialServiceBridge);
                EI2.h(1, 3, "VideoTutorials.LanguagePicker.Action");
                runnable2.run();
            }
        };
        PropertyModel propertyModel = c1541Lw1.c;
        propertyModel.o(pd2, runnable3);
        propertyModel.o(InterfaceC1671Mw1.b, new Runnable() { // from class: Jw1
            @Override // java.lang.Runnable
            public final void run() {
                C1541Lw1 c1541Lw12 = C1541Lw1.this;
                c1541Lw12.getClass();
                EI2.h(2, 3, "VideoTutorials.LanguagePicker.Action");
                String str = c1541Lw12.e;
                VideoTutorialServiceBridge videoTutorialServiceBridge = c1541Lw12.a;
                long j = videoTutorialServiceBridge.a;
                if (j != 0) {
                    N.MPZw2yWD(j, videoTutorialServiceBridge, str);
                }
                List a = videoTutorialServiceBridge.a(c1541Lw12.f);
                int i2 = 0;
                while (true) {
                    if (i2 >= a.size()) {
                        break;
                    }
                    if (TextUtils.equals((CharSequence) a.get(i2), c1541Lw12.e)) {
                        EI2.i(i2, 0, 20, 21, "VideoTutorials.LanguagePicker.LanguageSelected");
                        break;
                    }
                    i2++;
                }
                runnable.run();
            }
        });
        c1541Lw1.a(c1541Lw1.a.a(c1541Lw1.f));
    }
}
