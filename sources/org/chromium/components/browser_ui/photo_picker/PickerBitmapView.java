package org.chromium.components.browser_ui.photo_picker;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.android.chrome.R;
import defpackage.C0363Cu2;
import defpackage.C11674y84;
import defpackage.C6441iu2;
import defpackage.C7526m33;
import defpackage.DialogC3693au2;
import defpackage.U23;
import defpackage.ViewOnClickListenerC9876su2;
import defpackage.Y50;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PickerBitmapView extends U23 {
    public View A;
    public ImageView B;
    public TextView C;
    public boolean D;
    public boolean E;
    public final Context n;
    public ViewOnClickListenerC9876su2 o;
    public C7526m33 p;
    public C6441iu2 q;
    public ImageView r;
    public float s;
    public ViewGroup t;
    public TextView u;
    public ImageView v;
    public ImageView w;
    public ImageView x;
    public ImageView y;
    public ImageView z;

    @Override // defpackage.U23
    public final boolean n(Object obj) {
        C6441iu2 c6441iu2 = (C6441iu2) obj;
        int i = this.q.h;
        if (i == 2) {
            return false;
        }
        if ((i == 1) || this.o.y) {
            return false;
        }
        return super.n(c6441iu2);
    }

    public PickerBitmapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = -1.0f;
        this.n = context;
    }

    @Override // defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.r = (ImageView) findViewById(R.id.bitmap_view);
        this.x = (ImageView) findViewById(R.id.scrim);
        this.y = (ImageView) findViewById(R.id.selected);
        this.z = (ImageView) findViewById(R.id.unselected);
        this.A = findViewById(R.id.special_tile);
        this.B = (ImageView) findViewById(R.id.special_tile_icon);
        this.C = (TextView) findViewById(R.id.special_tile_label);
        this.t = (ViewGroup) findViewById(R.id.video_controls_small);
        this.u = (TextView) findViewById(R.id.video_duration);
        ImageView imageView = (ImageView) findViewById(R.id.small_play_button);
        this.v = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView2 = (ImageView) findViewById(R.id.large_play_button);
        this.w = imageView2;
        imageView2.setOnClickListener(this);
    }

    @Override // org.chromium.ui.widget.OptimizedFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.o;
        if (viewOnClickListenerC9876su2 == null) {
            return;
        }
        if (viewOnClickListenerC9876su2.x) {
            if (q()) {
                i3 = (int) (this.s * this.o.B);
            } else {
                i3 = this.o.C;
            }
            setMeasuredDimension(this.o.B, i3);
            return;
        }
        int i4 = viewOnClickListenerC9876su2.B;
        setMeasuredDimension(i4, i4);
    }

    @Override // defpackage.U23, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.v || view == this.w) {
            ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.o;
            Uri uri = this.q.a;
            DialogC3693au2 dialogC3693au2 = viewOnClickListenerC9876su2.a;
            if (dialogC3693au2 == null) {
                return;
            }
            Window window = dialogC3693au2.getWindow();
            final PickerVideoPlayer pickerVideoPlayer = viewOnClickListenerC9876su2.H;
            pickerVideoPlayer.a = window;
            pickerVideoPlayer.f(true);
            SpannableString spannableString = new SpannableString(uri.toString());
            spannableString.setSpan(new TextAppearanceSpan(pickerVideoPlayer.g, R.style.f102770_resource_name_obfuscated_res_0x7f150452), 0, uri.getScheme().length(), 33);
            pickerVideoPlayer.i.setText(spannableString, TextView.BufferType.SPANNABLE);
            pickerVideoPlayer.setVisibility(0);
            VideoView videoView = pickerVideoPlayer.j;
            videoView.setVisibility(0);
            videoView.setVideoURI(uri);
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: zu2
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    final PickerVideoPlayer pickerVideoPlayer2 = PickerVideoPlayer.this;
                    pickerVideoPlayer2.k = mediaPlayer;
                    pickerVideoPlayer2.e();
                    pickerVideoPlayer2.k.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: Au2
                        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                        public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i, int i2) {
                            int i3 = PickerVideoPlayer.F;
                            PickerVideoPlayer pickerVideoPlayer3 = PickerVideoPlayer.this;
                            pickerVideoPlayer3.a();
                            pickerVideoPlayer3.l.setVisibility(0);
                        }
                    });
                }
            });
            videoView.setOnCompletionListener(new C0363Cu2(pickerVideoPlayer));
            return;
        }
        super.onClick(view);
    }

    @Override // defpackage.U23
    public final void j() {
        C6441iu2 c6441iu2 = this.q;
        if (c6441iu2 == null) {
            return;
        }
        int i = c6441iu2.h;
        if (i == 2) {
            this.o.c(3, null, 3);
            return;
        }
        if (!(i == 1)) {
            onLongClick(this);
        } else {
            this.o.c(2, null, 2);
        }
    }

    @Override // defpackage.U23, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
    }

    @Override // defpackage.U23, android.widget.Checkable
    public final void setChecked(boolean z) {
        if (q()) {
            super.setChecked(z);
            s(false);
        }
    }

    @Override // defpackage.U23, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        C6441iu2 c6441iu2 = this.q;
        if (c6441iu2 == null) {
            return;
        }
        s(arrayList.contains(c6441iu2) != super.isChecked());
        super.d(arrayList);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (q()) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(isChecked());
            StringBuilder sb = new StringBuilder();
            String path = this.q.a.getPath();
            int lastIndexOf = path.lastIndexOf("/");
            if (lastIndexOf != -1) {
                path = path.substring(lastIndexOf + 1, path.length());
            }
            sb.append(path);
            sb.append(" ");
            C6441iu2 c6441iu2 = this.q;
            c6441iu2.getClass();
            sb.append(DateFormat.getDateTimeInstance().format(new Date(c6441iu2.g)));
            accessibilityNodeInfo.setText(sb.toString());
        }
    }

    public final boolean r(List list, String str, float f) {
        if (str == null || list.size() == 1) {
            this.r.setImageBitmap(list == null ? null : (Bitmap) list.get(0));
        } else {
            AnimationDrawable animationDrawable = new AnimationDrawable();
            for (int i = 0; i < list.size(); i++) {
                animationDrawable.addFrame(new BitmapDrawable(this.n.getResources(), (Bitmap) list.get(i)), 250);
            }
            animationDrawable.setOneShot(false);
            this.r.setImageDrawable(animationDrawable);
            animationDrawable.start();
        }
        this.u.setText(str);
        if (list != null && list.size() > 0) {
            this.s = f;
        }
        boolean z = !this.D;
        this.D = true;
        s(false);
        return z;
    }

    public final void p(C6441iu2 c6441iu2, List list, String str, boolean z, float f) {
        int i;
        C11674y84 c11674y84 = null;
        this.q = null;
        this.r.setImageBitmap(null);
        this.w.setVisibility(8);
        this.u.setText("");
        this.t.setVisibility(8);
        this.z.setVisibility(8);
        this.y.setVisibility(8);
        this.x.setVisibility(8);
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.E = false;
        setEnabled(true);
        this.q = c6441iu2;
        k(c6441iu2);
        int i2 = this.q.h;
        if (!(i2 == 1)) {
            if (!(i2 == 2)) {
                r(list, str, f);
                this.D = !z;
                s(false);
            }
        }
        Context context = this.n;
        Resources resources = context.getResources();
        int i3 = this.q.h;
        if (i3 == 1) {
            c11674y84 = C11674y84.b(resources, R.drawable.0_resource_name_obfuscated_res_0x7f0902fc, context.getTheme());
            i = R.string.0_resource_name_obfuscated_res_0x7f140838;
        } else {
            if (i3 == 2) {
                c11674y84 = C11674y84.b(resources, R.drawable.0_resource_name_obfuscated_res_0x7f0901dd, context.getTheme());
                i = R.string.0_resource_name_obfuscated_res_0x7f140837;
            } else {
                i = 0;
            }
        }
        this.B.setImageDrawable(c11674y84);
        this.B.setImageTintList(Y50.b(context, R.color.0_resource_name_obfuscated_res_0x7f07012a));
        this.B.setImageTintMode(PorterDuff.Mode.SRC_IN);
        this.C.setText(i);
        this.A.setVisibility(0);
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        this.D = true;
        s(false);
    }

    public final void s(boolean z) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z2 = !q();
        C7526m33 c7526m33 = this.p;
        boolean z3 = c7526m33 != null && c7526m33.e();
        Context context = this.n;
        context.getResources();
        if (z2) {
            boolean z4 = !z3;
            this.C.setEnabled(z4);
            this.B.setEnabled(z4);
            setEnabled(z4);
            i = R.color.0_resource_name_obfuscated_res_0x7f070811;
        } else {
            i = R.color.0_resource_name_obfuscated_res_0x7f070813;
        }
        int color = context.getColor(i);
        if (this.o.y && !z2) {
            color = 0;
        }
        setBackgroundColor(color);
        boolean d = this.p.d(this.q);
        int i2 = 8;
        this.y.setVisibility((z2 || !d) ? 8 : 0);
        boolean z5 = !z2 && !d && this.D && (z3 || this.o.x) && this.o.j;
        this.z.setVisibility(z5 ? 0 : 8);
        this.x.setVisibility(z5 ? 0 : 8);
        boolean z6 = this.D && this.q.h == 3;
        this.t.setVisibility((!z6 || this.o.x) ? 8 : 0);
        ImageView imageView = this.w;
        if (z6 && this.o.x) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        if (z2 || !isAttachedToWindow()) {
            return;
        }
        boolean d2 = this.p.d(this.q);
        ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.o;
        boolean z7 = viewOnClickListenerC9876su2.x;
        if (z7) {
            d2 = false;
        }
        if (d2 == this.E) {
            return;
        }
        this.E = d2;
        float f8 = 1.0f;
        if (z7) {
            float f9 = viewOnClickListenerC9876su2.B;
            f = 1.0f - ((0.07999998f * f9) / (f9 * this.s));
            f2 = 0.92f;
        } else {
            f = 0.8f;
            f2 = 0.8f;
        }
        if (d2) {
            f3 = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080671);
            f6 = f;
            f4 = 1.0f;
            f7 = -f3;
            f5 = f2;
        } else {
            f3 = 0.0f;
            f4 = f;
            f5 = 1.0f;
            f6 = 1.0f;
            f7 = 0.0f;
            f8 = f2;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f8, f5, f4, f6, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(z ? 100L : 0L);
        scaleAnimation.setFillAfter(true);
        this.r.startAnimation(scaleAnimation);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.t, (Property<ViewGroup, Float>) View.TRANSLATION_X, f7);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.t, (Property<ViewGroup, Float>) View.TRANSLATION_Y, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z ? 100L : 0L);
        animatorSet.start();
    }

    public final boolean q() {
        int i = this.q.h;
        return i == 0 || i == 3;
    }
}
