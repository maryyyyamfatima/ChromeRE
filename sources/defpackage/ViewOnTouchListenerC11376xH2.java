package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC11376xH2 implements View.OnTouchListener {
    public float a;
    public float g;
    public float h;
    public int i;
    public int j;
    public double k;
    public double l;
    public double m;
    public final /* synthetic */ ReactionLayout n;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ReactionLayout reactionLayout = this.n;
        if (!reactionLayout.n) {
            return true;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) reactionLayout.getLayoutParams();
        int i = reactionLayout.g.getResources().getDisplayMetrics().widthPixels;
        int i2 = reactionLayout.g.getResources().getDisplayMetrics().heightPixels;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            ((ZV2) reactionLayout.m).m++;
            this.a = reactionLayout.getRotation();
            this.g = rawX;
            this.h = rawY;
            int i3 = layoutParams.width;
            this.i = i3;
            int i4 = layoutParams.height;
            this.j = i4;
            double d = (i3 / 2.0d) + layoutParams.leftMargin;
            this.k = d;
            double d2 = (i4 / 2.0d) + layoutParams.topMargin;
            this.l = d2;
            this.m = Math.hypot(d - rawX, d2 - rawY);
        } else if (action == 1) {
            view.announceForAccessibility(reactionLayout.g.getString(R.string.f76320_resource_name_obfuscated_res_0x7f1405bf));
        } else {
            if (action != 2) {
                return true;
            }
            double d3 = rawX;
            double d4 = rawY;
            double hypot = Math.hypot(this.k - d3, this.l - d4) / this.m;
            int i5 = (int) (this.i * hypot);
            layoutParams.width = i5;
            int i6 = (int) (hypot * this.j);
            layoutParams.height = i6;
            int i7 = (int) (this.k - (i5 / 2.0d));
            layoutParams.leftMargin = i7;
            int i8 = (int) (this.l - (i6 / 2.0d));
            layoutParams.topMargin = i8;
            layoutParams.rightMargin = i - (i7 - i5);
            layoutParams.bottomMargin = i2 - (i8 - i6);
            reactionLayout.setLayoutParams(layoutParams);
            reactionLayout.setRotation((float) ((((Math.toDegrees(Math.atan2(this.l - d4, this.k - d3)) - Math.toDegrees(Math.atan2(this.l - this.h, this.k - this.g))) + this.a) + 360.0d) % 360.0d));
        }
        return true;
    }

    public ViewOnTouchListenerC11376xH2(ReactionLayout reactionLayout) {
        this.n = reactionLayout;
    }
}
