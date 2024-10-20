package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2816Vr1 extends LinearLayout {
    public final Button a;
    public final Button g;

    public C2816Vr1(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.f61090_resource_name_obfuscated_res_0x7f0e0291, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.survey_prompt_take_survey_button);
        this.a = button;
        Button button2 = (Button) findViewById(R.id.survey_prompt_no_thanks_button);
        this.g = button2;
        View findViewById = findViewById(R.id.survey_prompt_buttons);
        Rect rect = AbstractC2461Sy1.a;
        findViewById.post(new RunnableC2331Ry1(0, R.dimen.f40580_resource_name_obfuscated_res_0x7f080753, button, findViewById));
        View findViewById2 = findViewById(R.id.survey_prompt_buttons);
        findViewById2.post(new RunnableC2331Ry1(0, R.dimen.f40580_resource_name_obfuscated_res_0x7f080753, button2, findViewById2));
    }
}
