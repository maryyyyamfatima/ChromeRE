package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC11033wH2 implements View.OnTouchListener {
    public float a;
    public float g;
    public int h;
    public int i;
    public final /* synthetic */ GestureDetector j;
    public final /* synthetic */ ReactionLayout k;

    public ViewOnTouchListenerC11033wH2(ReactionLayout reactionLayout, GestureDetector gestureDetector) {
        this.k = reactionLayout;
        this.j = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.j.onTouchEvent(motionEvent)) {
            return true;
        }
        ReactionLayout reactionLayout = this.k;
        if (!reactionLayout.n) {
            return true;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) reactionLayout.getLayoutParams();
        int i = reactionLayout.g.getResources().getDisplayMetrics().widthPixels;
        int i2 = reactionLayout.g.getResources().getDisplayMetrics().heightPixels;
        int action = motionEvent.getAction();
        if (action == 0) {
            ZV2 zv2 = (ZV2) reactionLayout.m;
            zv2.p++;
            zv2.d(reactionLayout);
            this.a = motionEvent.getRawX() - layoutParams.leftMargin;
            this.g = motionEvent.getRawY() - layoutParams.topMargin;
            this.h = layoutParams.height;
            this.i = layoutParams.width;
        } else if (action == 1) {
            view.announceForAccessibility(reactionLayout.g.getString(R.string.f76360_resource_name_obfuscated_res_0x7f1405c3));
        } else if (action == 2) {
            layoutParams.leftMargin = (int) (motionEvent.getRawX() - this.a);
            int rawY = (int) (motionEvent.getRawY() - this.g);
            layoutParams.topMargin = rawY;
            layoutParams.rightMargin = i - (layoutParams.leftMargin - this.i);
            layoutParams.bottomMargin = i2 - (rawY - this.h);
            reactionLayout.setLayoutParams(layoutParams);
        }
        return true;
    }
}
