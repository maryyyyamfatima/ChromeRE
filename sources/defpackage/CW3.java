package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class CW3 extends FrameLayout implements View.OnTouchListener {
    public int a;
    public OrientationEventListener g;
    public boolean h;
    public Runnable i;
    public ImageButton j;
    public Runnable k;

    public CW3(Context context) {
        super(context);
        this.a = -1;
        setOnTouchListener(this);
        setBackground(new ColorDrawable(-12232092));
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.f61780_resource_name_obfuscated_res_0x7f0e02d6, (ViewGroup) this, true);
        findViewById(R.id.transition_switch_action).setOnClickListener(new ViewOnClickListenerC11452xW3(this));
        ((ImageView) findViewById(R.id.transition_icon)).setOnClickListener(new ViewOnClickListenerC11795yW3(this));
        d();
        if (getResources().getConfiguration().orientation == 2) {
            findViewById(R.id.transition_bottom_frame).setVisibility(8);
        }
        super.setVisibility(8);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void c(String str) {
        TextView textView = (TextView) findViewById(R.id.transition_text);
        if (str != null) {
            textView.setText(getContext().getString(R.string.f81740_resource_name_obfuscated_res_0x7f14083d, str));
        } else {
            textView.setText(getContext().getString(R.string.f81730_resource_name_obfuscated_res_0x7f14083c));
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (visibility != i) {
            if (i == 0) {
                if (this.g != null) {
                    return;
                }
                C12138zW3 c12138zW3 = new C12138zW3(this, getContext());
                this.g = c12138zW3;
                c12138zW3.enable();
                return;
            }
            OrientationEventListener orientationEventListener = this.g;
            if (orientationEventListener == null) {
                return;
            }
            this.a = -1;
            orientationEventListener.disable();
            this.g = null;
        }
    }

    public final void a(boolean z) {
        OrientationEventListener orientationEventListener = this.g;
        if (orientationEventListener != null) {
            this.a = -1;
            orientationEventListener.disable();
            this.g = null;
        }
        Animation animation = getAnimation();
        if (animation != null) {
            if (z || animation.getStartOffset() == 0) {
                return;
            }
            animation.setAnimationListener(null);
            clearAnimation();
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setDuration(500L);
        if (z) {
            alphaAnimation.setStartOffset(2000L);
        }
        alphaAnimation.setAnimationListener(new AW3(this));
        startAnimation(alphaAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OrientationEventListener orientationEventListener = this.g;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OrientationEventListener orientationEventListener = this.g;
        if (orientationEventListener != null) {
            this.a = -1;
            orientationEventListener.disable();
        }
        super.onDetachedFromWindow();
    }

    public final void b() {
        if (getWidth() <= 0 || getHeight() <= 0 || this.a == -1 || this.g == null || this.h) {
            return;
        }
        boolean z = getWidth() < getHeight();
        boolean z2 = Math.abs(this.a + (-180)) > 135;
        if (z != z2) {
            View findViewById = findViewById(R.id.transition_frame);
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            if (getLayoutDirection() == 1) {
                findViewById.setPivotX(height - findViewById.getPivotX());
                findViewById.setPivotY(width - findViewById.getPivotY());
            }
            if (z) {
                findViewById.setRotation(90.0f);
            } else {
                findViewById.setRotation(-90.0f);
            }
            findViewById.setTranslationX((width - height) / 2);
            findViewById.setTranslationY((height - width) / 2);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = width;
            layoutParams.width = height;
            findViewById.requestLayout();
        }
        if (!z2) {
            findViewById(R.id.transition_bottom_frame).setVisibility(8);
        } else {
            findViewById(R.id.transition_bottom_frame).setVisibility(0);
        }
        this.h = true;
        if (Math.abs(this.a + (-270)) < 5) {
            a(true);
        }
    }

    public final void d() {
        ImageButton imageButton = (ImageButton) ((ViewGroup) findViewById(R.id.transition_frame)).findViewById(R.id.back_button);
        this.j = imageButton;
        Runnable runnable = this.k;
        if (runnable == null) {
            imageButton.setVisibility(8);
            this.j.setTag(null);
            this.j.setOnClickListener(null);
        } else {
            imageButton.setTag(runnable);
            this.j.setVisibility(0);
            this.j.setOnClickListener(new BW3(this));
        }
    }
}
