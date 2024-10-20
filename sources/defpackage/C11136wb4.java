package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.video_tutorials.VideoPlayerActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wb4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11136wb4 extends AbstractC4815eA0 {
    public final /* synthetic */ String a;

    public C11136wb4(String str) {
        this.a = str;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void l() {
        VideoTutorialServiceBridge videoTutorialServiceBridge = (VideoTutorialServiceBridge) N.MBuXqyoS(Profile.d());
        final String str = this.a;
        videoTutorialServiceBridge.b(new Callback() { // from class: vb4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                for (Tutorial tutorial : (List) obj) {
                    if (TextUtils.equals(tutorial.h, str)) {
                        int i = tutorial.a;
                        AbstractC9764sb4.b(i, 6);
                        VideoPlayerActivity.u0(V60.a, i);
                        return;
                    }
                }
                AbstractC9764sb4.b(0, 7);
            }
        });
    }
}
