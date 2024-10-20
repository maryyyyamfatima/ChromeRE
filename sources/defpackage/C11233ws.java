package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11233ws {
    public final Runnable a;
    public final T8 b;
    public final View c;

    public C11233ws(Activity activity, Context context, FrameLayout frameLayout, RunnableC10360uK0 runnableC10360uK0) {
        this.a = runnableC10360uK0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f56050_resource_name_obfuscated_res_0x7f0e005d, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.image)).setImageDrawable(AbstractC2884Wf.a(context, R.drawable.f44740_resource_name_obfuscated_res_0x7f0900a9));
        ((TextView) inflate.findViewById(R.id.message)).setText(context.getString(R.string.f73680_resource_name_obfuscated_res_0x7f14049c));
        this.c = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        View findViewById = ((ViewGroup) activity.findViewById(android.R.id.content)).findViewById(R.id.toolbar_container);
        int[] iArr = new int[2];
        findViewById.getLocationInWindow(iArr);
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = findViewById.getWidth() + i;
        rect.bottom = context.getResources().getDimensionPixelSize(R.dimen.f28420_resource_name_obfuscated_res_0x7f080086) + findViewById.getHeight() + rect.top;
        T8 t8 = new T8(context, frameLayout, AbstractC2884Wf.a(context, R.drawable.f53010_resource_name_obfuscated_res_0x7f090471), inflate, new LI2(rect));
        this.b = t8;
        t8.r = context.getResources().getDimensionPixelSize(R.dimen.f41660_resource_name_obfuscated_res_0x7f0807c3);
        t8.v = 1;
        t8.d(R.style.f103200_resource_name_obfuscated_res_0x7f15047d);
        t8.p = new View.OnTouchListener() { // from class: vs
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C11233ws.this.a.run();
                return true;
            }
        };
    }
}
