package org.chromium.chrome.browser.dom_distiller;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC2030Pq0;
import defpackage.C9165qq0;
import defpackage.C9507rq0;
import defpackage.C9850sq0;
import defpackage.InterfaceC8822pq0;
import defpackage.OJ3;
import defpackage.ViewOnClickListenerC10193tq0;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.dom_distiller.core.DistilledPagePrefs$DistilledPagePrefsObserverWrapper;
import org.chromium.components.dom_distiller.core.DomDistillerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DistilledPagePrefsView extends LinearLayout implements InterfaceC8822pq0, SeekBar.OnSeekBarChangeListener {
    public static final /* synthetic */ int m = 0;
    public RadioGroup a;
    public final HashMap g;
    public final C9165qq0 h;
    public TextView i;
    public SeekBar j;
    public Spinner k;
    public final NumberFormat l;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public DistilledPagePrefsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Profile d = Profile.d();
        HashMap hashMap = AbstractC2030Pq0.a;
        Object obj = ThreadUtils.a;
        HashMap hashMap2 = AbstractC2030Pq0.a;
        DomDistillerService domDistillerService = (DomDistillerService) hashMap2.get(d);
        if (domDistillerService == null) {
            domDistillerService = (DomDistillerService) N.M2UAkcn4(d);
            hashMap2.put(d, domDistillerService);
        }
        this.h = domDistillerService.a;
        this.g = new HashMap();
        this.l = NumberFormat.getPercentInstance(Locale.getDefault());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (RadioGroup) findViewById(R.id.radio_button_group);
        HashMap hashMap = this.g;
        hashMap.put(0, a(R.id.light_mode, 0));
        hashMap.put(1, a(R.id.dark_mode, 1));
        hashMap.put(2, a(R.id.sepia_mode, 2));
        C9165qq0 c9165qq0 = this.h;
        ((RadioButton) hashMap.get(Integer.valueOf(N.Mi1cN$gk(c9165qq0.a, c9165qq0)))).setChecked(true);
        this.j = (SeekBar) findViewById(R.id.font_size);
        this.i = (TextView) findViewById(R.id.font_size_percentage);
        this.k = (Spinner) findViewById(R.id.font_family);
        C9507rq0 c9507rq0 = new C9507rq0(getContext(), new String[]{getResources().getString(R.string.f85210_resource_name_obfuscated_res_0x7f14099d), getResources().getString(R.string.f86140_resource_name_obfuscated_res_0x7f1409ff), getResources().getString(R.string.f77740_resource_name_obfuscated_res_0x7f140668)});
        c9507rq0.setDropDownViewResource(R.layout.f57050_resource_name_obfuscated_res_0x7f0e00d1);
        this.k.setAdapter((SpinnerAdapter) c9507rq0);
        Spinner spinner = this.k;
        long j = c9165qq0.a;
        spinner.setSelection(N.MSGVGQGo(j, c9165qq0));
        this.k.setOnItemSelectedListener(new C9850sq0(this));
        double MGNXZIUg = N.MGNXZIUg(j, c9165qq0);
        this.i.setText(this.l.format(MGNXZIUg));
        this.j.setProgress((int) Math.round((MGNXZIUg - 0.5d) * 20.0d));
        this.j.setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.setOrientation(0);
        HashMap hashMap = this.g;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((RadioButton) it.next()).getLayoutParams().width = 0;
        }
        super.onMeasure(i, i2);
        Iterator it2 = hashMap.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((RadioButton) it2.next()).getLineCount() > 1) {
                this.a.setOrientation(1);
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    ((RadioButton) it3.next()).getLayoutParams().width = -1;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9165qq0 c9165qq0 = this.h;
        HashMap hashMap = c9165qq0.b;
        if (hashMap.containsKey(this)) {
            return;
        }
        DistilledPagePrefs$DistilledPagePrefsObserverWrapper distilledPagePrefs$DistilledPagePrefsObserverWrapper = new DistilledPagePrefs$DistilledPagePrefsObserverWrapper(this);
        N.MznRD745(c9165qq0.a, c9165qq0, distilledPagePrefs$DistilledPagePrefsObserverWrapper.b);
        hashMap.put(this, distilledPagePrefs$DistilledPagePrefsObserverWrapper);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9165qq0 c9165qq0 = this.h;
        DistilledPagePrefs$DistilledPagePrefsObserverWrapper distilledPagePrefs$DistilledPagePrefsObserverWrapper = (DistilledPagePrefs$DistilledPagePrefsObserverWrapper) c9165qq0.b.remove(this);
        if (distilledPagePrefs$DistilledPagePrefsObserverWrapper == null) {
            return;
        }
        long j = c9165qq0.a;
        long j2 = distilledPagePrefs$DistilledPagePrefsObserverWrapper.b;
        N.M_HmEv0F(j, c9165qq0, j2);
        N.MGXAfNxO(j2);
    }

    public final RadioButton a(int i, int i2) {
        OJ3.a(i2);
        RadioButton radioButton = (RadioButton) findViewById(i);
        radioButton.setOnClickListener(new ViewOnClickListenerC10193tq0(this, i2));
        return radioButton;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float f = (i / 20.0f) + 0.5f;
        this.i.setText(this.l.format(f));
        if (z) {
            C9165qq0 c9165qq0 = this.h;
            N.MaB$bTgz(c9165qq0.a, c9165qq0, f);
        }
    }
}
