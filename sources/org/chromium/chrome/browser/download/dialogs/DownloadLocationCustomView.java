package org.chromium.chrome.browser.download.dialogs;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C0461Do0;
import defpackage.C2815Vr0;
import defpackage.C7453lr0;
import defpackage.C7928nE;
import defpackage.InterfaceC7109kr0;
import defpackage.R44;
import defpackage.UN;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.text.AlertDialogEditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadLocationCustomView extends ScrollView implements CompoundButton.OnCheckedChangeListener, InterfaceC7109kr0 {
    public final C7453lr0 a;
    public TextView g;
    public TextView h;
    public TextView i;
    public AlertDialogEditText j;
    public TextView k;
    public Spinner l;
    public TextView m;
    public CheckBox n;
    public int o;
    public long p;

    @Override // defpackage.InterfaceC7109kr0
    public final void a() {
    }

    public DownloadLocationCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new C7453lr0(context, this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.title);
        this.h = (TextView) findViewById(R.id.subtitle);
        this.i = (TextView) findViewById(R.id.incognito_warning);
        this.j = (AlertDialogEditText) findViewById(R.id.file_name);
        this.k = (TextView) findViewById(R.id.file_size);
        this.l = (Spinner) findViewById(R.id.file_location);
        this.m = (TextView) findViewById(R.id.location_available_space);
        this.n = (CheckBox) findViewById(R.id.show_again_checkbox);
    }

    @Override // defpackage.InterfaceC7109kr0
    public final void d() {
        int i;
        C7453lr0 c7453lr0 = this.a;
        int i2 = c7453lr0.a;
        int i3 = C7453lr0.m;
        if (i2 == -1 || (i = this.o) == 2 || i == 3) {
            i2 = c7453lr0.c();
        }
        if (this.o == 6) {
            long j = this.p;
            c7453lr0.getClass();
            String M4fixBWD = N.M4fixBWD();
            double d = 0.0d;
            int i4 = -1;
            for (int i5 = 0; i5 < c7453lr0.getCount(); i5++) {
                C0461Do0 c0461Do0 = (C0461Do0) c7453lr0.getItem(i5);
                if (c0461Do0 != null && !M4fixBWD.equals(c0461Do0.b)) {
                    double d2 = (c0461Do0.c - j) / c0461Do0.d;
                    if (d2 > d) {
                        i4 = i5;
                        d = d2;
                    }
                }
            }
            if (i4 != -1) {
                c7453lr0.a = i4;
                i2 = i4;
            } else {
                c7453lr0.a();
                i2 = 0;
            }
        }
        this.l.setAdapter((SpinnerAdapter) c7453lr0);
        this.l.setSelection(i2);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("SmartSuggestionForLargeDownloads")) {
            this.l.setOnItemSelectedListener(new C2815Vr0(this));
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        N.MPBZLcVx(R44.a(Profile.d()).a, "download.prompt_for_download_android", z ? 2 : 1);
    }
}
