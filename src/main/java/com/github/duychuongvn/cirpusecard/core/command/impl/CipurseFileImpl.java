package com.github.duychuongvn.cirpusecard.core.command.impl;

import com.github.duychuongvn.cirpusecard.core.command.ADFFile;
import com.github.duychuongvn.cirpusecard.core.command.CipurseFile;
import com.github.duychuongvn.cirpusecard.core.util.CommandApdu;

/**
 * Created by huynhduychuong on 4/28/2016.
 */
public abstract  class CipurseFileImpl implements CipurseFile {

    protected boolean activated;
    protected ADFFile currentADF;
    public CipurseFileImpl(ADFFile currentADF) {
        this.currentADF = currentADF;
    }
    public abstract byte[] readFileAttributes(CommandApdu commandApdu);

    public abstract byte[] updateFileAttributes(CommandApdu commandApdu);
}
