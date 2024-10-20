package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.view.ViewStub;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.video_tutorials.VideoPlayerActivity;
import org.chromium.chrome.browser.app.video_tutorials.VideoTutorialListActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y32 {
    public final Context a;
    public final KU3 b;
    public final Y94 c;
    public final VideoTutorialServiceBridge d;

    /* JADX WARN: Type inference failed for: r1v1, types: [T32] */
    /* JADX WARN: Type inference failed for: r2v0, types: [U32] */
    public Y32(ViewStub viewStub, Profile profile) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("VideoTutorials")) {
            this.a = viewStub.getContext();
            this.b = LU3.a(profile);
            this.c = new Y94(viewStub, AbstractC0687Fh1.c(profile.g(), AbstractC6474j01.a), new Callback() { // from class: T32
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Tutorial tutorial = (Tutorial) obj;
                    Y32 y32 = Y32.this;
                    y32.getClass();
                    int i = tutorial.a;
                    y32.b.notifyEvent(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : "video_tutorial_iph_clicked_voice_search" : "video_tutorial_iph_clicked_search" : "video_tutorial_iph_clicked_download" : "video_tutorial_iph_clicked_chrome_intro" : "video_tutorial_iph_clicked_summary");
                    int i2 = tutorial.a;
                    AbstractC9764sb4.b(i2, 9);
                    Context context = y32.a;
                    if (i2 != 1) {
                        VideoPlayerActivity.u0(context, i2);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setClass(context, VideoTutorialListActivity.class);
                    context.startActivity(intent);
                }
            }, new Callback() { // from class: U32
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Tutorial tutorial = (Tutorial) obj;
                    Y32 y32 = Y32.this;
                    y32.getClass();
                    int i = tutorial.a;
                    y32.b.notifyEvent(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : "video_tutorial_iph_dismissed_voice_search" : "video_tutorial_iph_dismissed_search" : "video_tutorial_iph_dismissed_download" : "video_tutorial_iph_dismissed_chrome_intro" : "video_tutorial_iph_dismissed_summary");
                    AbstractC9764sb4.b(tutorial.a, 10);
                    y32.d.b(new V32(y32));
                }
            });
            VideoTutorialServiceBridge videoTutorialServiceBridge = (VideoTutorialServiceBridge) N.MBuXqyoS(profile);
            this.d = videoTutorialServiceBridge;
            videoTutorialServiceBridge.b(new V32(this));
        }
    }
}
