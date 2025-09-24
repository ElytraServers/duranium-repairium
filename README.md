# Duranium Repairium 铿铀修复

[![Build](https://github.com/ElytraServers/duranium-repairium/actions/workflows/build.yml/badge.svg)](https://github.com/ElytraServers/duranium-repairium/actions/workflows/build.yml)

## Features 功能

### Sync Player Abilities on Dimension Change 跨世界传送时同步玩家能力

Used to fix the problem where using FTB Essentials commands (`/warp`, `/spawn`, etc) to travel among dimensions will
cause abilities (including fly ability "mayfly", from `/fly`) de-sync, which means you "locally" not able to fly, when
the server allows you to.

用于修复使用 FTB Essentials 指令跨世界传送时，能力数据失去同步。你“在本地”不能飞行，但是服务器允许。

[FTB-Mods-Issues#1782](https://github.com/FTBTeam/FTB-Mods-Issues/issues/1782)

### Unbreakable Packing Tape 无限耐久包装带

Used to fix the problem where _Unbreakable_ Packing Tapes from Sophisticated Storage are still receive damage
when using.

用于修复 Sophisticated Storage 包装带在 _不可破坏_ 的情况下仍然掉耐久。

[SophisticatedStorage#732](https://github.com/P3pp3rF1y/SophisticatedStorage/issues/732)
