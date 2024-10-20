package com.google.android.youtube.player.internal;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.AbstractBinderC6443iu4;
import defpackage.Bu4;
import defpackage.Eu4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class bj extends AbstractBinderC6443iu4 implements Eu4 {
    public bj() {
        super("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
    }

    public static Eu4 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof Eu4 ? (Eu4) queryLocalInterface : new Bu4(iBinder);
    }
}
