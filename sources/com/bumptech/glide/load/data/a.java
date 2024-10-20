package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.InterfaceC8075ng0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a implements InterfaceC8075ng0 {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    @Override // defpackage.InterfaceC8075ng0
    public final void b() {
    }

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.InterfaceC8075ng0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }
}
