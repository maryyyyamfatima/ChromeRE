package org.chromium.chrome.browser.app.video_tutorials;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.AbstractActivityC4038bu3;
import defpackage.AbstractC2281Ro1;
import defpackage.C10285u6;
import defpackage.C11473xa4;
import defpackage.C2021Po1;
import defpackage.C2967Wv2;
import defpackage.C5228fO;
import defpackage.C6930kK3;
import defpackage.C8490os;
import defpackage.Ea4;
import defpackage.G5;
import defpackage.InterfaceC8146ns;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.video_tutorials.VideoPlayerActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VideoPlayerActivity extends AbstractActivityC4038bu3 {
    public static final /* synthetic */ int D = 0;
    public C10285u6 B;
    public Ea4 C;

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(16777216);
        VideoTutorialServiceBridge videoTutorialServiceBridge = (VideoTutorialServiceBridge) N.MBuXqyoS(Profile.d());
        C2021Po1 c2021Po1 = new C2021Po1(new G5(this));
        this.B = new C10285u6(this, c2021Po1);
        Ea4 ea4 = new Ea4(this, videoTutorialServiceBridge, new C11473xa4(this), new C5228fO(), new Callback() { // from class: ya4
            public /* synthetic */ C11816ya4() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = VideoPlayerActivity.D;
                VideoPlayerActivity videoPlayerActivity = VideoPlayerActivity.this;
                videoPlayerActivity.getClass();
                AbstractC10107tb4.a.a = ((Tutorial) obj).a;
                Intent intent = new Intent();
                intent.setData(Uri.parse("chrome-native://newtab/"));
                intent.setClass(videoPlayerActivity, ChromeTabbedActivity.class);
                videoPlayerActivity.startActivity(intent);
            }
        }, new Runnable() { // from class: za4
            public /* synthetic */ RunnableC12159za4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerActivity.this.finish();
            }
        }, c2021Po1);
        this.C = ea4;
        setContentView(ea4.a.a);
        int p = AbstractC2281Ro1.p(0, getIntent(), "extra_video_tutorial");
        final Ea4 ea42 = this.C;
        Objects.requireNonNull(ea42);
        Callback callback = new Callback() { // from class: Aa4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tutorial tutorial = (Tutorial) obj;
                Ta4 ta4 = ((Ea4) Ca4.this).b;
                ta4.f = tutorial;
                VideoTutorialServiceBridge videoTutorialServiceBridge2 = ta4.b;
                long j = videoTutorialServiceBridge2.a;
                boolean z = false;
                if (TextUtils.isEmpty(j == 0 ? null : N.MKTDYLaI(j, videoTutorialServiceBridge2))) {
                    if (videoTutorialServiceBridge2.a(ta4.f.a).size() > 1) {
                        z = true;
                    }
                }
                if (z) {
                    ta4.c.k(Ua4.b, true);
                    ta4.d.a(ta4.f.a, new Pa4(ta4), ta4.h);
                } else {
                    ta4.b(tutorial);
                }
            }
        };
        long j = videoTutorialServiceBridge.a;
        if (j != 0) {
            N.MSP6HvY8(j, videoTutorialServiceBridge, p, callback);
        }
        final Ea4 ea43 = this.C;
        Objects.requireNonNull(ea43);
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: Ba4
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                Ea4 ea44 = (Ea4) Ca4.this;
                LD2 ld2 = Ua4.b;
                Ta4 ta4 = ea44.b;
                PropertyModel propertyModel = ta4.c;
                boolean j2 = propertyModel.j(ld2);
                if ((j2 || propertyModel.j(Ua4.a)) ? false : true) {
                    AbstractC9764sb4.b(ta4.f.a, 5);
                } else if (j2) {
                    EI2.h(0, 3, "VideoTutorials.LanguagePicker.Action");
                }
                return false;
            }
        });
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        Ea4 ea4 = this.C;
        C2967Wv2 c2967Wv2 = ea4.e;
        MediaSessionImpl mediaSessionImpl = c2967Wv2.a;
        if (mediaSessionImpl != null) {
            mediaSessionImpl.b.d(c2967Wv2);
            c2967Wv2.a = null;
        }
        ((C6930kK3) ea4.a.b).b();
        ea4.c.destroy();
        super.onDestroy();
    }

    public static void u0(Context context, int i) {
        Intent intent = new Intent();
        intent.setClass(context, VideoPlayerActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("extra_video_tutorial", i);
        context.startActivity(intent);
    }
}
