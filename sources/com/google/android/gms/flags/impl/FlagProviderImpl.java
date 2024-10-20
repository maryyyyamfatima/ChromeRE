package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.AbstractBinderC2996Xb1;
import defpackage.AbstractC7776mn3;
import defpackage.CallableC0421Dg0;
import defpackage.CallableC0551Eg0;
import defpackage.CallableC0681Fg0;
import defpackage.CallableC0811Gg0;
import defpackage.InterfaceC9436re1;
import defpackage.K83;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FlagProviderImpl extends AbstractBinderC2996Xb1 {
    public boolean a = false;
    public SharedPreferences g;

    @Override // defpackage.InterfaceC3126Yb1
    public void init(InterfaceC9436re1 interfaceC9436re1) {
        Context context = (Context) ObjectWrapper.h1(interfaceC9436re1);
        if (this.a) {
            return;
        }
        try {
            this.g = K83.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            Log.w("FlagProviderImpl", "Could not retrieve sdk flags, continuing with defaults: " + e.getMessage());
        }
    }

    @Override // defpackage.InterfaceC3126Yb1
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.g;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) AbstractC7776mn3.a(new CallableC0421Dg0(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: " + e.getMessage());
        }
        return valueOf.booleanValue();
    }

    @Override // defpackage.InterfaceC3126Yb1
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.g;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) AbstractC7776mn3.a(new CallableC0551Eg0(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: " + e.getMessage());
        }
        return valueOf.intValue();
    }

    @Override // defpackage.InterfaceC3126Yb1
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.g;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) AbstractC7776mn3.a(new CallableC0681Fg0(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: " + e.getMessage());
        }
        return valueOf.longValue();
    }

    @Override // defpackage.InterfaceC3126Yb1
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) AbstractC7776mn3.a(new CallableC0811Gg0(this.g, str, str2));
        } catch (Exception e) {
            Log.w("FlagDataUtils", "Flag value not available, returning default: " + e.getMessage());
            return str2;
        }
    }
}
