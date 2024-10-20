package org.chromium.chrome.browser.app.video_tutorials;

import J.N;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractActivityC4038bu3;
import defpackage.AbstractC0687Fh1;
import defpackage.AbstractC6474j01;
import defpackage.QY3;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.video_tutorials.VideoPlayerActivity;
import org.chromium.chrome.browser.app.video_tutorials.VideoTutorialListActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VideoTutorialListActivity extends AbstractActivityC4038bu3 {
    public static final /* synthetic */ int B = 0;

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e02e8);
        Profile d = Profile.d();
        new QY3((ViewGroup) findViewById(R.id.video_tutorial_list), (VideoTutorialServiceBridge) N.MBuXqyoS(d), AbstractC0687Fh1.c(d.g(), AbstractC6474j01.a), new Callback() { // from class: qb4
            public /* synthetic */ C9079qb4() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = VideoTutorialListActivity.B;
                VideoTutorialListActivity videoTutorialListActivity = VideoTutorialListActivity.this;
                videoTutorialListActivity.getClass();
                VideoPlayerActivity.u0(videoTutorialListActivity, ((Tutorial) obj).a);
            }
        });
        findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: rb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = VideoTutorialListActivity.B;
                VideoTutorialListActivity.this.finish();
            }
        });
    }
}
